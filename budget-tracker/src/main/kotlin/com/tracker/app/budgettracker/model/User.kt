package com.tracker.app.budgettracker.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document
data class User(
    @Id
    var userId :String,
    var userName:String,
    var userRole:String,
    var email:String,
    var password:String


) {
}