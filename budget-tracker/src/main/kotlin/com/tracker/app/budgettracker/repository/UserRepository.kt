package com.tracker.app.budgettracker.repository

import com.tracker.app.budgettracker.model.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository :MongoRepository<User,String> {

}