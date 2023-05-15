package com.tracker.app.budgettracker.controller

import com.tracker.app.budgettracker.model.User
import com.tracker.app.budgettracker.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tracker/user")
class UserController(private val service:UserService) {

    @GetMapping("/all")
    fun getAllUsers():ResponseEntity<List<User>>
    {
        return ResponseEntity.ok(service.getAllUsers())
    }
    @GetMapping("/{id}")
    fun getAllUsers(@PathVariable id :String):ResponseEntity<User>
    {
        return ResponseEntity.ok(service.getUserById(id))
    }
    @PostMapping("/add")
    fun createUser(@RequestBody user :User):ResponseEntity<User>
    {
        return ResponseEntity.ok(service.createUser(user))
    }

    @PutMapping("/update")
    fun updateUser(@RequestBody user :User):ResponseEntity<User>
    {
        return ResponseEntity.ok(service.updateUser(user))
    }
    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id :String):ResponseEntity<User>
    {
        return ResponseEntity.ok(service.deleteUser(id))
    }

}