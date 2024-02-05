package com.example.decompose.domain.use_case

import android.app.Application
import com.example.decompose.domain.R
import com.example.decompose.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import java.net.HttpRetryException
import javax.inject.Inject

class GetCoinUseCaseById @Inject constructor(
    private val repository: CoinRepository,
    private val application: Application
) {
    operator fun invoke(coinId: String) : Flow<com.example.decompose.domain.util.Resource<com.example.decompose.domain.model.CoinDetail>> = flow {
        try {
            emit(com.example.decompose.domain.util.Resource.Loading())
            val coin = repository.getCoinById(coinId)
            emit(com.example.decompose.domain.util.Resource.Success(coin))
        } catch(e: HttpRetryException) {
            emit(com.example.decompose.domain.util.Resource.Error(e.localizedMessage ?: application.getString(R.string.htttp_exeption)))
        } catch(e: IOException) {
            emit(com.example.decompose.domain.util.Resource.Error(application.getString(R.string.io_exeption)))
        }
    }
}