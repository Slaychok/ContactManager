package com.effectivemobile.contactmanager.domain.usecase

import com.effectivemobile.contactmanager.domain.repository.ContactRepository
import com.effectivemobile.contactmanager.domain.repository.DeletionStatus
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class DeleteDuplicateContactsUseCase @Inject constructor(
    private val contactRepository: ContactRepository
) {
    suspend operator fun invoke(): Flow<DeletionStatus> {
        return contactRepository.initiateDuplicateDeletion()
    }
}