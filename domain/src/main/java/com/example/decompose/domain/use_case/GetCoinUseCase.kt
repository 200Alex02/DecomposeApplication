package com.example.decompose.domain.use_case


import android.app.Application
import com.example.decompose.domain.R
import com.example.decompose.domain.util.Resource
import com.example.decompose.domain.model.Coin
import com.example.decompose.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import java.net.HttpRetryException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository,
    private val application: Application
) {

    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())

            val coins = repository.getCoins()
            emit(Resource.Success(coins))
        } catch(e: HttpRetryException) {
            emit(Resource.Error(e.localizedMessage ?: application.getString(R.string.htttp_exeption)))
        } catch(e: IOException) {
            emit(Resource.Error(application.getString(R.string.io_exeption)))
        }
    }
}