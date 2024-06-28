package com.tietoevry.service

import com.tietoevry.client.PersonClient
import com.tietoevry.util.MockDatabaseUtil
import kotlinx.coroutines.runBlocking
import org.slf4j.LoggerFactory

class TestService(
    private val personClient: PersonClient
) {
    fun testForFakeToken(): Boolean {
        val person = runBlocking {
            personClient.getPerson(SOCSECNUM_1, FAKE_TOKEN)
        }

        return if (person != null) {
            logger.info("Test failed. Person found even with no auth: $person")
            false
        } else {
            logger.info("Test passed. No person found with no auth")
            true
        }
    }

    fun testForPerson1(): Boolean {
        val person = runBlocking {
            personClient.getPerson(SOCSECNUM_1, TOKEN)
        }

        val actualPerson = MockDatabaseUtil.getPersonList().find { it.socSecNum == SOCSECNUM_1 }

        return if (person != null && person == actualPerson) {
            logger.info("Test passed. Person found: $person")
            true
        } else {
            logger.info("Test failed. No person found with socSecNum: $SOCSECNUM_1")
            false
        }
    }

    fun testForDatabaseContent(): Boolean {
        val person = runBlocking {
            personClient.getPerson(SOCSECNUM_1, TOKEN)
        }

        return if (person != null) {
            logger.info("Test passed. Person found with auth: $person")
            true
        } else {
            logger.info("Test failed. No person found with auth")
            false
        }
    }

    companion object {
        const val SOCSECNUM_1 = "19056726783"
        const val TOKEN = "Dummy.Token.For.Your.Convenience"
        const val FAKE_TOKEN = "This.Is.Not.The.Token.You.Are.Looking.For"
        private val logger = LoggerFactory.getLogger(TestService::class.java)
    }
}