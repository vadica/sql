package ru.netology.nmedia.dao

import androidx.lifecycle.LiveData
import ru.netology.nmedia.Post

interface PostDao {
    fun getAll(): List<Post>
    fun likeById(id: Long)
    fun shareById(id: Long)
    fun removeById(id: Long)
    fun save(post: Post): Post
    fun cancelEditing(post: Post)
    fun isVideo (post: Post): Boolean
}