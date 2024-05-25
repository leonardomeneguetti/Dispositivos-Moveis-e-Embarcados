package br.edu.ifsp.arq.ads.dmos5.ifitness.viewmodel

import android.app.Application
import android.preference.PreferenceManager
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import br.edu.ifsp.arq.ads.dmos5.ifitness.model.User
import br.edu.ifsp.arq.ads.dmos5.ifitness.repository.UsersRepository

class UserViewModel (application: Application) : AndroidViewModel(application) {

    private val usersRepository = UsersRepository(getApplication())

    fun createUser(user: User) = usersRepository.createUser(user)

    fun updateUser(user: User) = usersRepository.update(user)

    fun login(email: String, password: String) : LiveData<User> = usersRepository.login(email, password)

    fun logout() =
        PreferenceManager.getDefaultSharedPreferences(getApplication()).edit().remove(USER_ID).apply()

    fun isLogged(): LiveData<User> = PreferenceManager.getDefaultSharedPreferences(getApplication()).let {
        val id = it.getString(USER_ID, null)

        if(id.isNullOrEmpty())
            return MutableLiveData(null)

        return usersRepository.load(id)
    }

    fun resetPassword(email: String) = usersRepository.resetPassword(email)

    companion object {
        val USER_ID = "USER_ID"
    }
}