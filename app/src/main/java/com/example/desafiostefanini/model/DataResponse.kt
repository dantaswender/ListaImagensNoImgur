package com.example.desafiostefanini.model
import com.google.gson.annotations.SerializedName

data class DataResponse(
        @SerializedName("data")
        val `data`: List<Data>?,
        @SerializedName("success")
        val success: Boolean?,
        @SerializedName("status")
        val status: Int?
)

data class Data(
        @SerializedName("id")
        val id: String?,
        @SerializedName("title")
        val title: String?,
        @SerializedName("description")
        val description: Any?,
        @SerializedName("datetime")
        val datetime: Int?,
        @SerializedName("cover")
        val cover: String?,
        @SerializedName("cover_width")
        val coverWidth: Int?,
        @SerializedName("cover_height")
        val coverHeight: Int?,
        @SerializedName("account_url")
        val accountUrl: String?,
        @SerializedName("account_id")
        val accountId: Int?,
        @SerializedName("privacy")
        val privacy: String?,
        @SerializedName("layout")
        val layout: String?,
        @SerializedName("views")
        val views: Int?,
        @SerializedName("link")
        val link: String?,
        @SerializedName("ups")
        val ups: Int?,
        @SerializedName("downs")
        val downs: Int?,
        @SerializedName("points")
        val points: Int?,
        @SerializedName("score")
        val score: Int?,
        @SerializedName("is_album")
        val isAlbum: Boolean?,
        @SerializedName("vote")
        val vote: Any?,
        @SerializedName("favorite")
        val favorite: Boolean?,
        @SerializedName("nsfw")
        val nsfw: Boolean?,
        @SerializedName("section")
        val section: String?,
        @SerializedName("comment_count")
        val commentCount: Int?,
        @SerializedName("favorite_count")
        val favoriteCount: Int?,
        @SerializedName("topic")
        val topic: String?,
        @SerializedName("topic_id")
        val topicId: Int?,
        @SerializedName("images_count")
        val imagesCount: Int?,
        @SerializedName("in_gallery")
        val inGallery: Boolean?,
        @SerializedName("is_ad")
        val isAd: Boolean?,
        @SerializedName("tags")
        val tags: List<Tag>?,
        @SerializedName("ad_type")
        val adType: Int?,
        @SerializedName("ad_url")
        val adUrl: String?,
        @SerializedName("in_most_viral")
        val inMostViral: Boolean?,
        @SerializedName("include_album_ads")
        val includeAlbumAds: Boolean?,
        @SerializedName("images")
        val images: List<Image>?,
        @SerializedName("ad_config")
        val adConfig: AdConfig?,
        @SerializedName("type")
        val type: String?,
        @SerializedName("animated")
        val animated: Boolean?,
        @SerializedName("width")
        val width: Int?,
        @SerializedName("height")
        val height: Int?,
        @SerializedName("size")
        val size: Int?,
        @SerializedName("bandwidth")
        val bandwidth: Long?,
        @SerializedName("has_sound")
        val hasSound: Boolean?,
        @SerializedName("edited")
        val edited: Int?,
        @SerializedName("mp4_size")
        val mp4Size: Int?,
        @SerializedName("mp4")
        val mp4: String?,
        @SerializedName("gifv")
        val gifv: String?,
        @SerializedName("hls")
        val hls: String?,
        @SerializedName("processing")
        val processing: ProcessingX?
)

data class Tag(
        @SerializedName("name")
        val name: String?,
        @SerializedName("display_name")
        val displayName: String?,
        @SerializedName("followers")
        val followers: Int?,
        @SerializedName("total_items")
        val totalItems: Int?,
        @SerializedName("following")
        val following: Boolean?,
        @SerializedName("is_whitelisted")
        val isWhitelisted: Boolean?,
        @SerializedName("background_hash")
        val backgroundHash: String?,
        @SerializedName("thumbnail_hash")
        val thumbnailHash: Any?,
        @SerializedName("accent")
        val accent: String?,
        @SerializedName("background_is_animated")
        val backgroundIsAnimated: Boolean?,
        @SerializedName("thumbnail_is_animated")
        val thumbnailIsAnimated: Boolean?,
        @SerializedName("is_promoted")
        val isPromoted: Boolean?,
        @SerializedName("description")
        val description: String?,
        @SerializedName("logo_hash")
        val logoHash: Any?,
        @SerializedName("logo_destination_url")
        val logoDestinationUrl: Any?,
        @SerializedName("description_annotations")
        val descriptionAnnotations: DescriptionAnnotations?
)

data class Image(
        @SerializedName("id")
        val id: String?,
        @SerializedName("title")
        val title: Any?,
        @SerializedName("description")
        val description: String?,
        @SerializedName("datetime")
        val datetime: Int?,
        @SerializedName("type")
        val type: String?,
        @SerializedName("animated")
        val animated: Boolean?,
        @SerializedName("width")
        val width: Int?,
        @SerializedName("height")
        val height: Int?,
        @SerializedName("size")
        val size: Int?,
        @SerializedName("views")
        val views: Int?,
        @SerializedName("bandwidth")
        val bandwidth: Long?,
        @SerializedName("vote")
        val vote: Any?,
        @SerializedName("favorite")
        val favorite: Boolean?,
        @SerializedName("nsfw")
        val nsfw: Any?,
        @SerializedName("section")
        val section: Any?,
        @SerializedName("account_url")
        val accountUrl: Any?,
        @SerializedName("account_id")
        val accountId: Any?,
        @SerializedName("is_ad")
        val isAd: Boolean?,
        @SerializedName("in_most_viral")
        val inMostViral: Boolean?,
        @SerializedName("has_sound")
        val hasSound: Boolean?,
        @SerializedName("tags")
        val tags: List<Any>?,
        @SerializedName("ad_type")
        val adType: Int?,
        @SerializedName("ad_url")
        val adUrl: String?,
        @SerializedName("edited")
        val edited: String?,
        @SerializedName("in_gallery")
        val inGallery: Boolean?,
        @SerializedName("link")
        val link: String?,
        @SerializedName("comment_count")
        val commentCount: Any?,
        @SerializedName("favorite_count")
        val favoriteCount: Any?,
        @SerializedName("ups")
        val ups: Any?,
        @SerializedName("downs")
        val downs: Any?,
        @SerializedName("points")
        val points: Any?,
        @SerializedName("score")
        val score: Any?,
        @SerializedName("mp4_size")
        val mp4Size: Int?,
        @SerializedName("mp4")
        val mp4: String?,
        @SerializedName("gifv")
        val gifv: String?,
        @SerializedName("hls")
        val hls: String?,
        @SerializedName("processing")
        val processing: Processing?
)

data class AdConfig(
        @SerializedName("safeFlags")
        val safeFlags: List<String>?,
        @SerializedName("highRiskFlags")
        val highRiskFlags: List<Any>?,
        @SerializedName("unsafeFlags")
        val unsafeFlags: List<String>?,
        @SerializedName("wallUnsafeFlags")
        val wallUnsafeFlags: List<Any>?,
        @SerializedName("showsAds")
        val showsAds: Boolean?
)

data class ProcessingX(
        @SerializedName("status")
        val status: String?
)

class DescriptionAnnotations(
)

data class Processing(
        @SerializedName("status")
        val status: String?
)