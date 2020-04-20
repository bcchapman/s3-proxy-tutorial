package com.bcchapman

import java.time.ZonedDateTime

data class FileMetadata(val user: String,
                        val path: String,
                        val bucket: String,
                        val prefix: String,
                        val creationDatetime: ZonedDateTime = ZonedDateTime.now())