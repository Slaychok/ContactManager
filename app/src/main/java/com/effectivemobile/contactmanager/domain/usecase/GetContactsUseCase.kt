package com.effectivemobile.contactmanager.domain.usecase

import com.effectivemobile.contactmanager.domain.repository.ContactRepository
import javax.inject.Inject

class GetContactsUseCase @Inject constructor(
    private val contactRepository: ContactRepository
) {
    operator fun invoke() = contactRepository.getContacts()
}