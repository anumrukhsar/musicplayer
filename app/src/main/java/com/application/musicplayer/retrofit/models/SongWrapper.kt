package com.application.musicplayer.retrofit.models

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
class SongWrapper {
    @SerializedName("wrapperType")
    @Expose
    private var wrapperType: String? = null

    @SerializedName("kind")
    @Expose
    private var kind: String? = null

    @SerializedName("artistId")
    @Expose
    private var artistId: Int? = null

    @SerializedName("collectionId")
    @Expose
    private var collectionId: Int? = null

    @SerializedName("trackId")
    @Expose
    private var trackId: Int? = null

    @SerializedName("artistName")
    @Expose
    private var artistName: String? = null

    @SerializedName("collectionName")
    @Expose
    private var collectionName: String? = null

    @SerializedName("trackName")
    @Expose
    private var trackName: String? = null

    @SerializedName("collectionCensoredName")
    @Expose
    private var collectionCensoredName: String? = null

    @SerializedName("trackCensoredName")
    @Expose
    private var trackCensoredName: String? = null

    @SerializedName("collectionArtistId")
    @Expose
    private var collectionArtistId: Int? = null

    @SerializedName("collectionArtistName")
    @Expose
    private var collectionArtistName: String? = null

    @SerializedName("collectionArtistViewUrl")
    @Expose
    private var collectionArtistViewUrl: String? = null

    @SerializedName("artistViewUrl")
    @Expose
    private var artistViewUrl: String? = null

    @SerializedName("collectionViewUrl")
    @Expose
    private var collectionViewUrl: String? = null

    @SerializedName("trackViewUrl")
    @Expose
    private var trackViewUrl: String? = null

    @SerializedName("previewUrl")
    @Expose
    private var previewUrl: String? = null

    @SerializedName("artworkUrl30")
    @Expose
    private var artworkUrl30: String? = null

    @SerializedName("artworkUrl60")
    @Expose
    private var artworkUrl60: String? = null

    @SerializedName("artworkUrl100")
    @Expose
    private var artworkUrl100: String? = null

    @SerializedName("collectionPrice")
    @Expose
    private var collectionPrice: Double? = null

    @SerializedName("trackPrice")
    @Expose
    private var trackPrice: Double? = null

    @SerializedName("releaseDate")
    @Expose
    private var releaseDate: String? = null

    @SerializedName("collectionExplicitness")
    @Expose
    private var collectionExplicitness: String? = null

    @SerializedName("trackExplicitness")
    @Expose
    private var trackExplicitness: String? = null

    @SerializedName("discCount")
    @Expose
    private var discCount: Int? = null

    @SerializedName("discNumber")
    @Expose
    private var discNumber: Int? = null

    @SerializedName("trackCount")
    @Expose
    private var trackCount: Int? = null

    @SerializedName("trackNumber")
    @Expose
    private var trackNumber: Int? = null

    @SerializedName("trackTimeMillis")
    @Expose
    private var trackTimeMillis: Int? = null

    @SerializedName("country")
    @Expose
    private var country: String? = null

    @SerializedName("currency")
    @Expose
    private var currency: String? = null

    @SerializedName("primaryGenreName")
    @Expose
    private var primaryGenreName: String? = null

    @SerializedName("isStreamable")
    @Expose
    private var isStreamable: Boolean? = null

    private var isPlaying: Boolean? = false

    fun getWrapperType(): String? {
        return wrapperType
    }

    fun setWrapperType(wrapperType: String?) {
        this.wrapperType = wrapperType
    }

    fun getKind(): String? {
        return kind
    }

    fun setKind(kind: String?) {
        this.kind = kind
    }

    fun getArtistId(): Int? {
        return artistId
    }

    fun setArtistId(artistId: Int?) {
        this.artistId = artistId
    }

    fun getCollectionId(): Int? {
        return collectionId
    }

    fun setCollectionId(collectionId: Int?) {
        this.collectionId = collectionId
    }

    fun getTrackId(): Int? {
        return trackId
    }

    fun setTrackId(trackId: Int?) {
        this.trackId = trackId
    }

    fun getArtistName(): String? {
        return artistName
    }

    fun setArtistName(artistName: String?) {
        this.artistName = artistName
    }

    fun getCollectionName(): String? {
        return collectionName
    }

    fun setCollectionName(collectionName: String?) {
        this.collectionName = collectionName
    }

    fun getTrackName(): String? {
        return trackName
    }

    fun setTrackName(trackName: String?) {
        this.trackName = trackName
    }

    fun getCollectionCensoredName(): String? {
        return collectionCensoredName
    }

    fun setCollectionCensoredName(collectionCensoredName: String?) {
        this.collectionCensoredName = collectionCensoredName
    }

    fun getTrackCensoredName(): String? {
        return trackCensoredName
    }

    fun setTrackCensoredName(trackCensoredName: String?) {
        this.trackCensoredName = trackCensoredName
    }

    fun getCollectionArtistId(): Int? {
        return collectionArtistId
    }

    fun setCollectionArtistId(collectionArtistId: Int?) {
        this.collectionArtistId = collectionArtistId
    }

    fun getCollectionArtistName(): String? {
        return collectionArtistName
    }

    fun setCollectionArtistName(collectionArtistName: String?) {
        this.collectionArtistName = collectionArtistName
    }

    fun getCollectionArtistViewUrl(): String? {
        return collectionArtistViewUrl
    }

    fun setCollectionArtistViewUrl(collectionArtistViewUrl: String?) {
        this.collectionArtistViewUrl = collectionArtistViewUrl
    }

    fun getArtistViewUrl(): String? {
        return artistViewUrl
    }

    fun setArtistViewUrl(artistViewUrl: String?) {
        this.artistViewUrl = artistViewUrl
    }

    fun getCollectionViewUrl(): String? {
        return collectionViewUrl
    }

    fun setCollectionViewUrl(collectionViewUrl: String?) {
        this.collectionViewUrl = collectionViewUrl
    }

    fun getTrackViewUrl(): String? {
        return trackViewUrl
    }

    fun setTrackViewUrl(trackViewUrl: String?) {
        this.trackViewUrl = trackViewUrl
    }

    fun getPreviewUrl(): String? {
        return previewUrl
    }

    fun setPreviewUrl(previewUrl: String?) {
        this.previewUrl = previewUrl
    }

    fun getArtworkUrl30(): String? {
        return artworkUrl30
    }

    fun setArtworkUrl30(artworkUrl30: String?) {
        this.artworkUrl30 = artworkUrl30
    }

    fun getArtworkUrl60(): String? {
        return artworkUrl60
    }

    fun setArtworkUrl60(artworkUrl60: String?) {
        this.artworkUrl60 = artworkUrl60
    }

    fun getArtworkUrl100(): String? {
        return artworkUrl100
    }

    fun setArtworkUrl100(artworkUrl100: String?) {
        this.artworkUrl100 = artworkUrl100
    }

    fun getCollectionPrice(): Double? {
        return collectionPrice
    }

    fun setCollectionPrice(collectionPrice: Double?) {
        this.collectionPrice = collectionPrice
    }

    fun getTrackPrice(): Double? {
        return trackPrice
    }

    fun setTrackPrice(trackPrice: Double?) {
        this.trackPrice = trackPrice
    }

    fun getReleaseDate(): String? {
        return releaseDate
    }

    fun setReleaseDate(releaseDate: String?) {
        this.releaseDate = releaseDate
    }

    fun getCollectionExplicitness(): String? {
        return collectionExplicitness
    }

    fun setCollectionExplicitness(collectionExplicitness: String?) {
        this.collectionExplicitness = collectionExplicitness
    }

    fun getTrackExplicitness(): String? {
        return trackExplicitness
    }

    fun setTrackExplicitness(trackExplicitness: String?) {
        this.trackExplicitness = trackExplicitness
    }

    fun getDiscCount(): Int? {
        return discCount
    }

    fun setDiscCount(discCount: Int?) {
        this.discCount = discCount
    }

    fun getDiscNumber(): Int? {
        return discNumber
    }

    fun setDiscNumber(discNumber: Int?) {
        this.discNumber = discNumber
    }

    fun getTrackCount(): Int? {
        return trackCount
    }

    fun setTrackCount(trackCount: Int?) {
        this.trackCount = trackCount
    }

    fun getTrackNumber(): Int? {
        return trackNumber
    }

    fun setTrackNumber(trackNumber: Int?) {
        this.trackNumber = trackNumber
    }

    fun getTrackTimeMillis(): Int? {
        return trackTimeMillis
    }

    fun setTrackTimeMillis(trackTimeMillis: Int?) {
        this.trackTimeMillis = trackTimeMillis
    }

    fun getCountry(): String? {
        return country
    }

    fun setCountry(country: String?) {
        this.country = country
    }

    fun getCurrency(): String? {
        return currency
    }

    fun setCurrency(currency: String?) {
        this.currency = currency
    }

    fun getPrimaryGenreName(): String? {
        return primaryGenreName
    }

    fun setPrimaryGenreName(primaryGenreName: String?) {
        this.primaryGenreName = primaryGenreName
    }

    fun getIsStreamable(): Boolean? {
        return isStreamable
    }

    fun setIsStreamable(isStreamable: Boolean?) {
        this.isStreamable = isStreamable
    }

    fun getIsPlaying(): Boolean? {
        return isPlaying
    }

    fun setIsPlaying(isPlaying: Boolean?) {
        this.isPlaying = isPlaying
    }
}