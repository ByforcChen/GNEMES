package com.malygos.gnemes.domain

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRawValue
import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.util.*
import javax.persistence.*
@Document(collection = "MemePost")
data class MemePost(
        @Id
        var id: String?,
        @JsonFormat(pattern = "yyyy-MM-dd-hh-mm")
        var createdTime: Date,
        /**
         * Meme difficulty level
         * obvious：100
         * mediocre：200
         * tough：300
         * pro：400
         * monster：500
         * god : 600
         */
        var difficulty: Byte,
        var dir: String,
        var likes: Long,
        var viewer: Long,
        @ElementCollection
        var tag: List<String>?,
        //Original Language Sentences
//        @Field("olsentences")
        @JsonRawValue
        var oLSentences: List<String>?,
        //Second Language Sentences
//        @Field("slsentences")
        @JsonRawValue
        var sLSentences: List<String>?,
        var phrase: List<String>?
)
