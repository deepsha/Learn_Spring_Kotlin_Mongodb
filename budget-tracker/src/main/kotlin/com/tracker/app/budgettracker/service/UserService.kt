package com.tracker.app.budgettracker.service

import com.tracker.app.budgettracker.model.User
import com.tracker.app.budgettracker.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (private val userRepository:UserRepository){
    fun getAllUsers(): List<User>? {
        return userRepository.findAll()
    }

    fun getUserById(id: String): User? {
        return userRepository.findById(id).orElse(null)
    }

    fun createUser(user: User): User? {
        return userRepository.save(user)
    }

    fun updateUser(user: User): User? {
        var existingUser=this.userRepository.findById(user.userId).orElse(null)
        existingUser.userName=user.userName
        existingUser.userRole=user.userRole
        existingUser.email=user.email
        existingUser.password=user.password
        return userRepository.save(existingUser)
    }

    fun deleteUser(id: String): User? {
        var existingUser=this.userRepository.findById(id).orElse(null)
        this.userRepository.deleteById(id)
        return existingUser

    }
}