package com.effectivemobile.contactmanager.domain.repository

import com.effectivemobile.contactmanager.domain.model.Contact
import kotlinx.coroutines.flow.Flow

interface ContactRepository {
    // Gets the current list of contacts
    fun getContacts(): Flow<List<Contact>>

    // Initiates the duplicate deletion process
    suspend fun initiateDuplicateDeletion(): Flow<DeletionStatus>

    // (Alternative/Refinement for status)
    // fun observeDeletionStatus(): Flow<DeletionStatus>
}

sealed class DeletionStatus {
    object Idle : DeletionStatus()
    object InProgress : DeletionStatus()
    object Success : DeletionStatus()
    data class Error(val message: String) : DeletionStatus()
    object NoDuplicatesFound : DeletionStatus()
}