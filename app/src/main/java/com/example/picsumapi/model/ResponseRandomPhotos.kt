package com.example.picsumapi.model


import com.google.gson.annotations.SerializedName

class ResponseRandomPhotos : ArrayList<ResponseRandomPhotos.ResponseRandomPhotosItem>() {
    data class ResponseRandomPhotosItem(
        @SerializedName("alt_description")
        val altDescription: String?, // a woman in a white dress holding her hands together
        @SerializedName("blur_hash")
        val blurHash: String?, // L9BM0z6Q0f]*quJTxuwJ-:w^M|t7
        @SerializedName("color")
        val color: String?, // #EFEFEF
        @SerializedName("created_at")
        val createdAt: String?, // 2022-11-15T16:32:22Z
        @SerializedName("current_user_collections")
        val currentUserCollections: List<Any?>?,
        @SerializedName("description")
        val description: String?, // Instagram: @kobzevvaa 🧚🏻‍♀️
        @SerializedName("downloads")
        val downloads: Int?, // 0
        @SerializedName("exif")
        val exif: Exif?,
        @SerializedName("height")
        val height: Int?, // 3648
        @SerializedName("id")
        val id: String?, // ljQJTYuCJdA
        @SerializedName("liked_by_user")
        val likedByUser: Boolean?, // false
        @SerializedName("likes")
        val likes: Int?, // 3
        @SerializedName("links")
        val links: Links?,
        @SerializedName("location")
        val location: Location?,
        @SerializedName("promoted_at")
        val promotedAt: String?, // 2023-04-03T14:50:08Z
        @SerializedName("sponsorship")
        val sponsorship: Any?, // null
        @SerializedName("topic_submissions")
        val topicSubmissions: TopicSubmissions?,
        @SerializedName("updated_at")
        val updatedAt: String?, // 2023-04-08T00:21:32Z
        @SerializedName("urls")
        val urls: Urls?,
        @SerializedName("user")
        val user: User?,
        @SerializedName("views")
        val views: Int?, // 0
        @SerializedName("width")
        val width: Int? // 5472


    ) {
        data class Exif(
            @SerializedName("aperture")
            val aperture: String?, // 1.8
            @SerializedName("exposure_time")
            val exposureTime: String?, // 1/3200
            @SerializedName("focal_length")
            val focalLength: String?, // 0.0
            @SerializedName("iso")
            val iso: Int?, // 200
            @SerializedName("make")
            val make: String?, // Canon
            @SerializedName("model")
            val model: String?, //  EOS R6
            @SerializedName("name")
            val name: String? // Canon, EOS R6
        )

        data class Links(
            @SerializedName("download")
            val download: String?, // https://unsplash.com/photos/ljQJTYuCJdA/download?ixid=Mnw0MzQ3MDF8MHwxfHJhbmRvbXx8fHx8fHx8fDE2ODEzMzg2MzE
            @SerializedName("download_location")
            val downloadLocation: String?, // https://api.unsplash.com/photos/ljQJTYuCJdA/download?ixid=Mnw0MzQ3MDF8MHwxfHJhbmRvbXx8fHx8fHx8fDE2ODEzMzg2MzE
            @SerializedName("html")
            val html: String?, // https://unsplash.com/photos/ljQJTYuCJdA
            @SerializedName("self")
            val self: String? // https://api.unsplash.com/photos/ljQJTYuCJdA
        )

        data class Location(
            @SerializedName("city")
            val city: String?, // Kyiv
            @SerializedName("country")
            val country: String?, // Ukraine
            @SerializedName("name")
            val name: String?, // Kyiv, Ukraine
            @SerializedName("position")
            val position: Position?
        ) {
            data class Position(
                @SerializedName("latitude")
                val latitude: Double?, // 0.0
                @SerializedName("longitude")
                val longitude: Double? // 0.0
            )
        }

        data class TopicSubmissions(
            @SerializedName("athletics")
            val athletics: Athletics?,
            @SerializedName("3d-renders")
            val dRenders: DRenders?,
            @SerializedName("experimental")
            val experimental: Experimental?,
            @SerializedName("film")
            val film: Film?,
            @SerializedName("nature")
            val nature: Nature?,
            @SerializedName("textures-patterns")
            val texturesPatterns: TexturesPatterns?,
            @SerializedName("travel")
            val travel: Travel?,
            @SerializedName("wallpapers")
            val wallpapers: Wallpapers?
        ) {
            data class Athletics(
                @SerializedName("approved_on")
                val approvedOn: String?, // 2023-04-05T06:56:08Z
                @SerializedName("status")
                val status: String? // approved
            )

            data class DRenders(
                @SerializedName("approved_on")
                val approvedOn: String?, // 2023-03-29T10:16:33Z
                @SerializedName("status")
                val status: String? // approved
            )

            data class Experimental(
                @SerializedName("status")
                val status: String? // rejected
            )

            data class Film(
                @SerializedName("status")
                val status: String? // unevaluated
            )

            data class Nature(
                @SerializedName("approved_on")
                val approvedOn: String?, // 2023-03-17T10:10:34Z
                @SerializedName("status")
                val status: String? // rejected
            )

            data class TexturesPatterns(
                @SerializedName("approved_on")
                val approvedOn: String?, // 2023-03-27T17:09:08Z
                @SerializedName("status")
                val status: String? // approved
            )

            data class Travel(
                @SerializedName("approved_on")
                val approvedOn: String?, // 2023-03-14T21:23:10Z
                @SerializedName("status")
                val status: String? // approved
            )

            data class Wallpapers(
                @SerializedName("status")
                val status: String? // rejected
            )
        }

        data class Urls(
            @SerializedName("full")
            val full: String?, // https://plus.unsplash.com/premium_photo-1668383203267-877d4b1feb47?crop=entropy&cs=srgb&fm=jpg&ixid=Mnw0MzQ3MDF8MHwxfHJhbmRvbXx8fHx8fHx8fDE2ODEzMzg2MzE&ixlib=rb-4.0.3&q=85
            @SerializedName("raw")
            val raw: String?, // https://plus.unsplash.com/premium_photo-1668383203267-877d4b1feb47?ixid=Mnw0MzQ3MDF8MHwxfHJhbmRvbXx8fHx8fHx8fDE2ODEzMzg2MzE&ixlib=rb-4.0.3
            @SerializedName("regular")
            val regular: String?, // https://plus.unsplash.com/premium_photo-1668383203267-877d4b1feb47?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=Mnw0MzQ3MDF8MHwxfHJhbmRvbXx8fHx8fHx8fDE2ODEzMzg2MzE&ixlib=rb-4.0.3&q=80&w=1080
            @SerializedName("small")
            val small: String?, // https://plus.unsplash.com/premium_photo-1668383203267-877d4b1feb47?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=Mnw0MzQ3MDF8MHwxfHJhbmRvbXx8fHx8fHx8fDE2ODEzMzg2MzE&ixlib=rb-4.0.3&q=80&w=400
            @SerializedName("small_s3")
            val smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/unsplash-premium-photos-production/premium_photo-1668383203267-877d4b1feb47
            @SerializedName("thumb")
            val thumb: String? // https://plus.unsplash.com/premium_photo-1668383203267-877d4b1feb47?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=Mnw0MzQ3MDF8MHwxfHJhbmRvbXx8fHx8fHx8fDE2ODEzMzg2MzE&ixlib=rb-4.0.3&q=80&w=200
        )

        data class User(
            @SerializedName("accepted_tos")
            val acceptedTos: Boolean?, // true
            @SerializedName("bio")
            val bio: String?, // Do you need more free photos? A picture is worth a thousand words, and I have 29,000+ of them at Kaboompics.com
            @SerializedName("first_name")
            val firstName: String?, // Michael
            @SerializedName("for_hire")
            val forHire: Boolean?, // true
            @SerializedName("id")
            val id: String?, // Mt6-LHNgdaU
            @SerializedName("instagram_username")
            val instagramUsername: String?, // mchltckr
            @SerializedName("last_name")
            val lastName: String?, // Tucker
            @SerializedName("links")
            val links: Links?,
            @SerializedName("location")
            val location: String?, // New Orleans, LA
            @SerializedName("name")
            val name: String?, // Michael Tucker
            @SerializedName("portfolio_url")
            val portfolioUrl: String?, // http://mchltckr.com
            @SerializedName("profile_image")
            val profileImage: ProfileImage?,
            @SerializedName("social")
            val social: Social?,
            @SerializedName("total_collections")
            val totalCollections: Int?, // 1
            @SerializedName("total_likes")
            val totalLikes: Int?, // 0
            @SerializedName("total_photos")
            val totalPhotos: Int?, // 352
            @SerializedName("twitter_username")
            val twitterUsername: String?, // ClevelandArt
            @SerializedName("updated_at")
            val updatedAt: String?, // 2023-04-03T14:51:11Z
            @SerializedName("username")
            val username: String? // mchltckr
        ) {
            data class Links(
                @SerializedName("followers")
                val followers: String?, // https://api.unsplash.com/users/mchltckr/followers
                @SerializedName("following")
                val following: String?, // https://api.unsplash.com/users/mchltckr/following
                @SerializedName("html")
                val html: String?, // https://unsplash.com/@mchltckr
                @SerializedName("likes")
                val likes: String?, // https://api.unsplash.com/users/mchltckr/likes
                @SerializedName("photos")
                val photos: String?, // https://api.unsplash.com/users/mchltckr/photos
                @SerializedName("portfolio")
                val portfolio: String?, // https://api.unsplash.com/users/mchltckr/portfolio
                @SerializedName("self")
                val self: String? // https://api.unsplash.com/users/mchltckr
            )

            data class ProfileImage(
                @SerializedName("large")
                val large: String?, // https://images.unsplash.com/profile-1664890315652-e19fe5aa7262image?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                @SerializedName("medium")
                val medium: String?, // https://images.unsplash.com/profile-1664890315652-e19fe5aa7262image?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                @SerializedName("small")
                val small: String? // https://images.unsplash.com/profile-1664890315652-e19fe5aa7262image?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
            )

            data class Social(
                @SerializedName("instagram_username")
                val instagramUsername: String?, // mchltckr
                @SerializedName("paypal_email")
                val paypalEmail: Any?, // null
                @SerializedName("portfolio_url")
                val portfolioUrl: String?, // http://mchltckr.com
                @SerializedName("twitter_username")
                val twitterUsername: String? // ClevelandArt
            )
        }
    }
}