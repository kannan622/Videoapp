package com.example.videopager.data

import com.player.models.VideoData

object AssetVideoData {
    private const val ASSET_PATH = "file:///android_asset"
    val myData = VideoData(
        id = "1",
        mediaUri = "",
        previewImageUri = "$ASSET_PATH/loadgif.gif",
    )

}
