package com.example.decompose.data.use_case

import android.app.Application
import com.example.decompose.data1.R
import com.example.decompose.domain.util.Resource
import com.example.decompose.domain.model.CoinDetail
import com.example.decompose.domain.repository.CoinRepository
import com.example.decompose.domain.use_case.GetCoinUseCaseById
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCaseByIdImpl @Inject constructor(
    private val repository: CoinRepository,
    private val application: Application
): GetCoinUseCaseById {
    override operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId)
            emit(Resource.Success(coin))
        } catch(e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: application.getString(R.string.htttp_exeption)))
        } catch(e: IOException) {
            emit(Resource.Error(application.getString(R.string.io_exeption)))
        }
    }
}