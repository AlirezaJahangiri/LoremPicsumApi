package com.example.picsumapi.model


import com.google.gson.annotations.SerializedName

class ResponseNewPhotos : ArrayList<ResponseNewPhotos.ResponseNewPhotosItem>(){
    data class ResponseNewPhotosItem(
        @SerializedName("alt_description")
        val altDescription: String?, // a yellow sign with black text
        @SerializedName("blur_hash")
        val blurHash: String?, // LOI$KVV?NitS~URkRjax_4Nf$]xC
        @SerializedName("color")
        val color: String?, // #598cc0
        @SerializedName("created_at")
        val createdAt: String?, // 2022-08-31T14:36:55Z
        @SerializedName("current_user_collections")
        val currentUserCollections: List<Any?>?,
        @SerializedName("description")
        val description: Any?, // null
        @SerializedName("height")
        val height: Int?, // 4160
        @SerializedName("id")
        val id: String?, // Cy5dya5MAlI
        @SerializedName("liked_by_user")
        val likedByUser: Boolean?, // false
        @SerializedName("likes")
        val likes: Int?, // 588
        @SerializedName("links")
        val links: Links?,
        @SerializedName("promoted_at")
        val promotedAt: String?, // 2023-04-12T05:48:01Z
        @SerializedName("sponsorship")
        val sponsorship: Sponsorship?,
        @SerializedName("topic_submissions")
        val topicSubmissions: TopicSubmissions?,
        @SerializedName("updated_at")
        val updatedAt: String?, // 2023-04-14T11:35:03Z
        @SerializedName("urls")
        val urls: Urls?,
        @SerializedName("user")
        val user: User?,
        @SerializedName("width")
        val width: Int? // 3120
    ) {
        data class Links(
            @SerializedName("download")
            val download: String?, // https://unsplash.com/photos/Cy5dya5MAlI/download?ixid=Mnw0MzQ3MDF8MXwxfGFsbHwxODF8fHx8fHwyfHwxNjgxNDg5MjIx
            @SerializedName("download_location")
            val downloadLocation: String?, // https://api.unsplash.com/photos/Cy5dya5MAlI/download?ixid=Mnw0MzQ3MDF8MXwxfGFsbHwxODF8fHx8fHwyfHwxNjgxNDg5MjIx
            @SerializedName("html")
            val html: String?, // https://unsplash.com/photos/Cy5dya5MAlI
            @SerializedName("self")
            val self: String? // https://api.unsplash.com/photos/Cy5dya5MAlI
        )
    
        data class Sponsorship(
            @SerializedName("impression_urls")
            val impressionUrls: List<String?>?,
            @SerializedName("sponsor")
            val sponsor: Sponsor?,
            @SerializedName("tagline")
            val tagline: String?, // Start targeting valuable customers today
            @SerializedName("tagline_url")
            val taglineUrl: String? // https://ad.doubleclick.net/ddm/trackclk/N1224323.3286893UNSPLASH/B29258209.358659708;dc_trk_aid=549462680;dc_trk_cid=186410004;dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;tfua=;ltd=
        ) {
            data class Sponsor(
                @SerializedName("accepted_tos")
                val acceptedTos: Boolean?, // true
                @SerializedName("bio")
                val bio: String?, // The all-in-one Marketing Platform built for growing businesses.
                @SerializedName("first_name")
                val firstName: String?, // Mailchimp
                @SerializedName("for_hire")
                val forHire: Boolean?, // false
                @SerializedName("id")
                val id: String?, // D-bxv1Imc-o
                @SerializedName("instagram_username")
                val instagramUsername: String?, // mailchimp
                @SerializedName("last_name")
                val lastName: Any?, // null
                @SerializedName("links")
                val links: Links?,
                @SerializedName("location")
                val location: Any?, // null
                @SerializedName("name")
                val name: String?, // Mailchimp
                @SerializedName("portfolio_url")
                val portfolioUrl: String?, // https://mailchimp.com/
                @SerializedName("profile_image")
                val profileImage: ProfileImage?,
                @SerializedName("social")
                val social: Social?,
                @SerializedName("total_collections")
                val totalCollections: Int?, // 0
                @SerializedName("total_likes")
                val totalLikes: Int?, // 19
                @SerializedName("total_photos")
                val totalPhotos: Int?, // 13
                @SerializedName("twitter_username")
                val twitterUsername: String?, // Mailchimp
                @SerializedName("updated_at")
                val updatedAt: String?, // 2023-04-14T09:35:47Z
                @SerializedName("username")
                val username: String? // mailchimp
            ) {
                data class Links(
                    @SerializedName("followers")
                    val followers: String?, // https://api.unsplash.com/users/mailchimp/followers
                    @SerializedName("following")
                    val following: String?, // https://api.unsplash.com/users/mailchimp/following
                    @SerializedName("html")
                    val html: String?, // https://unsplash.com/de/@mailchimp
                    @SerializedName("likes")
                    val likes: String?, // https://api.unsplash.com/users/mailchimp/likes
                    @SerializedName("photos")
                    val photos: String?, // https://api.unsplash.com/users/mailchimp/photos
                    @SerializedName("portfolio")
                    val portfolio: String?, // https://api.unsplash.com/users/mailchimp/portfolio
                    @SerializedName("self")
                    val self: String? // https://api.unsplash.com/users/mailchimp
                )
    
                data class ProfileImage(
                    @SerializedName("large")
                    val large: String?, // https://images.unsplash.com/profile-1609545740442-928866556c38image?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                    @SerializedName("medium")
                    val medium: String?, // https://images.unsplash.com/profile-1609545740442-928866556c38image?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                    @SerializedName("small")
                    val small: String? // https://images.unsplash.com/profile-1609545740442-928866556c38image?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
                )
    
                data class Social(
                    @SerializedName("instagram_username")
                    val instagramUsername: String?, // mailchimp
                    @SerializedName("paypal_email")
                    val paypalEmail: Any?, // null
                    @SerializedName("portfolio_url")
                    val portfolioUrl: String?, // https://mailchimp.com/
                    @SerializedName("twitter_username")
                    val twitterUsername: String? // Mailchimp
                )
            }
        }
    
        data class TopicSubmissions(
            @SerializedName("architecture-interior")
            val architectureInterior: ArchitectureInterior?,
            @SerializedName("3d-renders")
            val dRenders: DRenders?,
            @SerializedName("experimental")
            val experimental: Experimental?,
            @SerializedName("people")
            val people: People?,
            @SerializedName("textures-patterns")
            val texturesPatterns: TexturesPatterns?,
            @SerializedName("wallpapers")
            val wallpapers: Wallpapers?
        ) {
            data class ArchitectureInterior(
                @SerializedName("approved_on")
                val approvedOn: String?, // 2023-04-11T13:45:36Z
                @SerializedName("status")
                val status: String? // approved
            )
    
            data class DRenders(
                @SerializedName("approved_on")
                val approvedOn: String?, // 2023-04-11T10:15:43Z
                @SerializedName("status")
                val status: String? // approved
            )
    
            data class Experimental(
                @SerializedName("status")
                val status: String? // unevaluated
            )
    
            data class People(
                @SerializedName("approved_on")
                val approvedOn: String?, // 2023-04-13T16:00:39Z
                @SerializedName("status")
                val status: String? // approved
            )
    
            data class TexturesPatterns(
                @SerializedName("approved_on")
                val approvedOn: String?, // 2023-04-13T13:22:15Z
                @SerializedName("status")
                val status: String? // approved
            )
    
            data class Wallpapers(
                @SerializedName("approved_on")
                val approvedOn: String?, // 2023-04-13T12:33:51Z
                @SerializedName("status")
                val status: String? // approved
            )
        }
    
        data class Urls(
            @SerializedName("full")
            val full: String?, // https://images.unsplash.com/photo-1661956600655-e772b2b97db4?crop=entropy&cs=srgb&fm=jpg&ixid=Mnw0MzQ3MDF8MXwxfGFsbHwxODF8fHx8fHwyfHwxNjgxNDg5MjIx&ixlib=rb-4.0.3&q=85
            @SerializedName("raw")
            val raw: String?, // https://images.unsplash.com/photo-1661956600655-e772b2b97db4?ixid=Mnw0MzQ3MDF8MXwxfGFsbHwxODF8fHx8fHwyfHwxNjgxNDg5MjIx&ixlib=rb-4.0.3
            @SerializedName("regular")
            val regular: String?, // https://images.unsplash.com/photo-1661956600655-e772b2b97db4?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=Mnw0MzQ3MDF8MXwxfGFsbHwxODF8fHx8fHwyfHwxNjgxNDg5MjIx&ixlib=rb-4.0.3&q=80&w=1080
            @SerializedName("small")
            val small: String?, // https://images.unsplash.com/photo-1661956600655-e772b2b97db4?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=Mnw0MzQ3MDF8MXwxfGFsbHwxODF8fHx8fHwyfHwxNjgxNDg5MjIx&ixlib=rb-4.0.3&q=80&w=400
            @SerializedName("small_s3")
            val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1661956600655-e772b2b97db4
            @SerializedName("thumb")
            val thumb: String? // https://images.unsplash.com/photo-1661956600655-e772b2b97db4?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=Mnw0MzQ3MDF8MXwxfGFsbHwxODF8fHx8fHwyfHwxNjgxNDg5MjIx&ixlib=rb-4.0.3&q=80&w=200
        )
    
        data class User(
            @SerializedName("accepted_tos")
            val acceptedTos: Boolean?, // true
            @SerializedName("bio")
            val bio: String?, // The all-in-one Marketing Platform built for growing businesses.
            @SerializedName("first_name")
            val firstName: String?, // Mailchimp
            @SerializedName("for_hire")
            val forHire: Boolean?, // false
            @SerializedName("id")
            val id: String?, // D-bxv1Imc-o
            @SerializedName("instagram_username")
            val instagramUsername: String?, // mailchimp
            @SerializedName("last_name")
            val lastName: String?, // miyagi
            @SerializedName("links")
            val links: Links?,
            @SerializedName("location")
            val location: String?, // japan osaka
            @SerializedName("name")
            val name: String?, // Mailchimp
            @SerializedName("portfolio_url")
            val portfolioUrl: String?, // https://mailchimp.com/
            @SerializedName("profile_image")
            val profileImage: ProfileImage?,
            @SerializedName("social")
            val social: Social?,
            @SerializedName("total_collections")
            val totalCollections: Int?, // 0
            @SerializedName("total_likes")
            val totalLikes: Int?, // 19
            @SerializedName("total_photos")
            val totalPhotos: Int?, // 13
            @SerializedName("twitter_username")
            val twitterUsername: String?, // Mailchimp
            @SerializedName("updated_at")
            val updatedAt: String?, // 2023-04-14T09:35:47Z
            @SerializedName("username")
            val username: String? // mailchimp
        ) {
            data class Links(
                @SerializedName("followers")
                val followers: String?, // https://api.unsplash.com/users/mailchimp/followers
                @SerializedName("following")
                val following: String?, // https://api.unsplash.com/users/mailchimp/following
                @SerializedName("html")
                val html: String?, // https://unsplash.com/de/@mailchimp
                @SerializedName("likes")
                val likes: String?, // https://api.unsplash.com/users/mailchimp/likes
                @SerializedName("photos")
                val photos: String?, // https://api.unsplash.com/users/mailchimp/photos
                @SerializedName("portfolio")
                val portfolio: String?, // https://api.unsplash.com/users/mailchimp/portfolio
                @SerializedName("self")
                val self: String? // https://api.unsplash.com/users/mailchimp
            )
    
            data class ProfileImage(
                @SerializedName("large")
                val large: String?, // https://images.unsplash.com/profile-1609545740442-928866556c38image?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                @SerializedName("medium")
                val medium: String?, // https://images.unsplash.com/profile-1609545740442-928866556c38image?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                @SerializedName("small")
                val small: String? // https://images.unsplash.com/profile-1609545740442-928866556c38image?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
            )
    
            data class Social(
                @SerializedName("instagram_username")
                val instagramUsername: String?, // mailchimp
                @SerializedName("paypal_email")
                val paypalEmail: Any?, // null
                @SerializedName("portfolio_url")
                val portfolioUrl: String?, // https://mailchimp.com/
                @SerializedName("twitter_username")
                val twitterUsername: String? // Mailchimp
            )
        }
    }
}