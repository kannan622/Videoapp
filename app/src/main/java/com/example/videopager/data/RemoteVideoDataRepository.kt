package com.example.videopager.data

import android.util.Log
import com.player.models.VideoData
import com.videopager.data.VideoDataRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class RemoteVideoDataRepository : VideoDataRepository {
    override fun videoData(): Flow<List<VideoData>> {

        var videoList: List<VideoData> = mutableListOf()

        videoList = arrayListOf(

            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6415d234bbed3c001168fe12/6415d234bbed3c001168fe12.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641824a2bbed3c00116915a1/641824a2bbed3c00116915a1.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641b6335266aea001186628a/641b6335266aea001186628a.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641b63b2266aea00118662d7/641b63b2266aea00118662d7.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641bd324266aea0011866736/641bd324266aea0011866736.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641bd407266aea0011866750/641bd407266aea0011866750.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641bd520266aea0011866760/641bd520266aea0011866760.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641bd6c8266aea00118668a6/641bd6c8266aea00118668a6.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641bd742266aea00118668af/641bd742266aea00118668af.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641bd77b266aea00118668b8/641bd77b266aea00118668b8.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641c1fc6266aea0011868996/641c1fc6266aea0011868996.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641c4959266aea001186a9a6/641c4959266aea001186a9a6.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641c70d1266aea001186b60d/641c70d1266aea001186b60d.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641c82b6266aea001186bc05/641c82b6266aea001186bc05.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641c8681266aea001186bdca/641c8681266aea001186bdca.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641cb8239d33980011c5bfff/641cb8239d33980011c5bfff.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641d30519d33980011c5c3d9/641d30519d33980011c5c3d9.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641d560e266aea001186d16a/641d560e266aea001186d16a.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641d72b9266aea001186dbfa/641d72b9266aea001186dbfa.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641f4fb1266aea001186fc7c/641f4fb1266aea001186fc7c.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641fb086e0248f0011dd57a0/641fb086e0248f0011dd57a0.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641fdd6c266aea001186fef9/641fdd6c266aea001186fef9.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641fe6fc266aea001186ff2c/641fe6fc266aea001186ff2c.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/641fe7f0266aea001186ff31/641fe7f0266aea001186ff31.m3u8"),

            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64207035266aea00118701ea/64207035266aea00118701ea.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64207615e0248f0011dd5c2a/64207615e0248f0011dd5c2a.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6420d461e0248f0011dd5d01/6420d461e0248f0011dd5d01.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6420d985266aea00118703ec/6420d985266aea00118703ec.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64216c6ce0248f0011dd6a27/64216c6ce0248f0011dd6a27.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6421cc19e0248f0011dd7219/6421cc19e0248f0011dd7219.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6421cdb1266aea0011871911/6421cdb1266aea0011871911.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6421cdf6e0248f0011dd7243/6421cdf6e0248f0011dd7243.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6421d00b266aea0011871939/6421d00b266aea0011871939.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6421df65e0248f0011dd73ec/6421df65e0248f0011dd73ec.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6421e0e3e0248f0011dd7479/6421e0e3e0248f0011dd7479.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6421f0b6266aea0011871d77/6421f0b6266aea0011871d77.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64227ed8266aea001187229b/64227ed8266aea001187229b.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64229ddda965ad001151b890/64229ddda965ad001151b890.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64229e7268242000118f31d0/64229e7268242000118f31d0.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64229ef0a965ad001151b8ca/64229ef0a965ad001151b8ca.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6422a27da965ad001151b9ad/6422a27da965ad001151b9ad.m3u8"),

            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6423054d33718600112c257c/6423054d33718600112c257c.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64234a48f7fd2b001115293c/64234a48f7fd2b001115293c.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64234c10d956490011e6b971/64234c10d956490011e6b971.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/642350b3d956490011e6b9a7/642350b3d956490011e6b9a7.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64236b4ed956490011e6ba8f/64236b4ed956490011e6ba8f.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/642607607e8b20001176d5cd/642607607e8b20001176d5cd.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64268b27e13053001185970d/64268b27e13053001185970d.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/642aa1c1855b9f0011d8873f/642aa1c1855b9f0011d8873f.m3u8"),

            //from here

            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/642ab7fa9119dc0011741ce0/642ab7fa9119dc0011741ce0.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/642d5435fdf48600111681c3/642d5435fdf48600111681c3.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/642d5816fdf4860011168254/642d5816fdf4860011168254.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/642d5c6273c72700110f2c45/642d5c6273c72700110f2c45.m3u8"),

            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/642d607ef04f6a0011fd3751/642d607ef04f6a0011fd3751.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64359bb773f8c9001105c925/64359bb773f8c9001105c925.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/643f7126e2abe70011b25df6/643f7126e2abe70011b25df6.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/644669a492dea000116efc2a/644669a492dea000116efc2a.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/644669de92dea000116efc2c/644669de92dea000116efc2c.m3u8"),

            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/644c248994eb170011cb3baa/644c248994eb170011cb3baa.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64665a19fdaade00119839f5/64665a19fdaade00119839f5.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/646753a580fc4f0011e08fa8/646753a580fc4f0011e08fa8.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6468f398fdaade0011987d90/6468f398fdaade0011987d90.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6469aad2fdaade0011988194/6469aad2fdaade0011988194.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6469b42dfdaade001198821f/6469b42dfdaade001198821f.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6469c26efdaade001198823a/6469c26efdaade001198823a.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/648093ae85fcf10011dc211f/648093ae85fcf10011dc211f.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6483055c7909fb0011081341/6483055c7909fb0011081341.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/648af0e03bb5fe0011e20dd1/648af0e03bb5fe0011e20dd1.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/648c2fc56f83700011b03cdd/648c2fc56f83700011b03cdd.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/648c314a6f83700011b0476f/648c314a6f83700011b0476f.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/6493f6c0d5aed30011f32d2f/6493f6c0d5aed30011f32d2f.m3u8"),

            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64956db4d5aed30011f477f2/64956db4d5aed30011f477f2.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64956ebdd5aed30011f478f3/64956ebdd5aed30011f478f3.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64b63c7b63cc990011556189/64b63c7b63cc990011556189.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64b63c9463cc990011556197/64b63c9463cc990011556197.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64b63e4463cc990011556267/64b63e4463cc990011556267.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64b6c79702655500111494b1/64b6c79702655500111494b1.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64bf60856377f50011724a53/64bf60856377f50011724a53.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64bf95cc6377f50011727468/64bf95cc6377f50011727468.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64bfee7b6377f5001172de1b/64bfee7b6377f5001172de1b.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64bfeef76377f5001172ded6/64bfeef76377f5001172ded6.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64c9e6bfc3d49300113ab3a3/64c9e6bfc3d49300113ab3a3.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64c9e742c3d49300113ab3b4/64c9e742c3d49300113ab3b4.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d22bf1f0a0e80011783ce3/64d22bf1f0a0e80011783ce3.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d22c61f0a0e80011783cff/64d22c61f0a0e80011783cff.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d22d3af0a0e80011783d53/64d22d3af0a0e80011783d53.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d22e9af0a0e800117840a0/64d22e9af0a0e800117840a0.m3u"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d22f2cf0a0e800117840d7/64d22f2cf0a0e800117840d7.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d23087f0a0e80011784141/64d23087f0a0e80011784141.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d23a8af0a0e80011784bd2/64d23a8af0a0e80011784bd2.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d23cf4f0a0e800117850bc/64d23cf4f0a0e800117850bc.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d23ef6f0a0e800117852bc/64d23ef6f0a0e800117852bc.m3u8"),

            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d23f84f0a0e8001178531e/64d23f84f0a0e8001178531e.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d23fd0f0a0e8001178537e/64d23fd0f0a0e8001178537e.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d24119f0a0e800117853fd/64d24119f0a0e800117853fd.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d3294df0a0e8001178d103/64d3294df0a0e8001178d103.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d61ca70c3a640011630bee/64d61ca70c3a640011630bee.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d61ccd0c3a640011630c15/64d61ccd0c3a640011630c15.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d61ced0c3a640011630c2b/64d61ced0c3a640011630c2b.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d61d980c3a640011630c77/64d61d980c3a640011630c77.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d61dbc0c3a640011630c8d/64d61dbc0c3a640011630c8d.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d61dda0c3a640011630ca4/64d61dda0c3a640011630ca4.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d61e630c3a640011630d45/64d61e630c3a640011630d45.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d61e8f0c3a640011630d5c/64d61e8f0c3a640011630d5c.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d61ee00c3a640011630d72/64d61ee00c3a640011630d72.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d61f2f0c3a640011630d89/64d61f2f0c3a640011630d89.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d61f910c3a640011630db5/64d61f910c3a640011630db5.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d61fb00c3a640011630dcb/64d61fb00c3a640011630dcb.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d61ff20c3a640011630de2/64d61ff20c3a640011630de2.m3u8"),

            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d6203c0c3a640011630e0e/64d6203c0c3a640011630e0e.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d620590c3a640011630e24/64d620590c3a640011630e24.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d620770c3a640011630e3a/64d620770c3a640011630e3a.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d621200c3a640011630ea5/64d621200c3a640011630ea5.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d621850c3a640011630ec8/64d621850c3a640011630ec8.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d621e90c3a640011630edf/64d621e90c3a640011630edf.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d6237d0c3a6400116311b1/64d6237d0c3a6400116311b1.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d630cc0c3a640011631700/64d630cc0c3a640011631700.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d631140c3a6400116319ab/64d631140c3a6400116319ab.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d9ca6d0c3a6400116422f7/64d9ca6d0c3a6400116422f7.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d9d5a81a0520001180c5bf/64d9d5a81a0520001180c5bf.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64d9effe1a0520001180d549/64d9effe1a0520001180d549.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64da15541a0520001180f389/64da15541a0520001180f389.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64da15851a0520001180f3fe/64da15851a0520001180f3fe.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64da1f591a0520001180fdb0/64da1f591a0520001180fdb0.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64da1f751a0520001180fddd/64da1f751a0520001180fddd.m3u8"),

            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64dca293ca3ea200113d4ab6/64dca293ca3ea200113d4ab6.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64dca5e0ca3ea200113d4fa0/64dca5e0ca3ea200113d4fa0.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64dcb568ca3ea200113d666c/64dcb568ca3ea200113d666c.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64dcb59bca3ea200113d667d/64dcb59bca3ea200113d667d.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64df5b17305a5000111772b7/64df5b17305a5000111772b7.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64df7086305a5000111787c5/64df7086305a5000111787c5.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64df7584305a5000111794a0/64df7584305a5000111794a0.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e0b81f305a500011187579/64e0b81f305a500011187579.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e1e8db29891100126b5d9d/64e1e8db29891100126b5d9d.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e35caa29891100126c37a4/64e35caa29891100126c37a4.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e3607f29891100126c408e/64e3607f29891100126c408e.m3u8"),

            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e363ca29891100126c4597/64e363ca29891100126c4597.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e3680129891100126c4e3b/64e3680129891100126c4e3b.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e3683029891100126c4ebf/64e3683029891100126c4ebf.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e38c6a29891100126c72d2/64e38c6a29891100126c72d2.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e392b529891100126c7bf2/64e392b529891100126c7bf2.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e483a62982fb001263244a/64e483a62982fb001263244a.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e743b85ba892001182246a/64e743b85ba892001182246a.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e7443f5ba892001182249e/64e7443f5ba892001182249e.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e747235ba8920011822f33/64e747235ba8920011822f33.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64e755dd5ba89200118252be/64e755dd5ba89200118252be.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64ec7ab1c371120012b7afc0/64ec7ab1c371120012b7afc0.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64ec7adcc371120012b7affe/64ec7adcc371120012b7affe.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64edb234c294ec0012462c46/64edb234c294ec0012462c46.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64edc150c294ec0012463b88/64edc150c294ec0012463b88.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64edc193c294ec0012463c86/64edc193c294ec0012463c86.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64f061ee02bd5f001278b3c3/64f061ee02bd5f001278b3c3.m3u8"),

            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64f0671402bd5f001278b8b2/64f0671402bd5f001278b8b2.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64f06c3602bd5f001278be37/64f06c3602bd5f001278be37.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64f072d702bd5f001278c486/64f072d702bd5f001278c486.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64f0739702bd5f001278c72a/64f0739702bd5f001278c72a.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64f074b602bd5f001278c892/64f074b602bd5f001278c892.m3u8"),
            AssetVideoData.myData.copy(mediaUri = "https://stage-blogs.kynhood.com/64f0767502bd5f001278c9aa/64f0767502bd5f001278c9aa.m3u8")


            )





        return flowOf(videoList)
    }

}
