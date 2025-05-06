package com.effectivemobile.contactmanager.domain.model

data class Contact(
    val id: Long,
    val name: String,
    val mainPhoneNumber: String?
)