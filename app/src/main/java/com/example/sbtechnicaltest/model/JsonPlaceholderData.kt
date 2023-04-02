package com.example.sbtechnicaltest.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * A data class modelling Json collected via HTTP.
 *
 * @param albumId the album ID of the object
 * @param id the id of the object
 * @param title the title of the object
 * @param url the url of the object
 * @param thumbnailUrl the thumbnail url of the object
 */
data class JsonPlaceholderData(@SerializedName("albumId") @Expose val albumId: Int,
                               @SerializedName("id") @Expose val id: Int,
                               @SerializedName("title") @Expose val title: String,
                               @SerializedName("url") @Expose val url: String,
                               @SerializedName("thumbnailUrl") @Expose val thumbnailUrl: String)
