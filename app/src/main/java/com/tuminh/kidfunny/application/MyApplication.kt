package com.tuminh.kidfunny.application

import android.app.Application
import com.tuminh.kidfunny.R
import com.tuminh.kidfunny.model.Story

class MyApplication : Application() {

    val listNumberCount: ArrayList<Int> = arrayListOf(
        R.drawable.img_num_1,
        R.drawable.img_num_2,
        R.drawable.img_num_3,
        R.drawable.img_num_4,
        R.drawable.img_num_5,
        R.drawable.img_num_6,
        R.drawable.img_num_7,
        R.drawable.img_num_8,
        R.drawable.img_num_9,
        R.drawable.img_num_10,
    )

    val listAlphabet:ArrayList<Int> = arrayListOf(
        R.drawable.img_alphabet_1,
        R.drawable.img_alphabet_2,
        R.drawable.img_alphabet_3,
        R.drawable.img_alphabet_4,
        R.drawable.img_alphabet_5,
        R.drawable.img_alphabet_6,
        R.drawable.img_alphabet_7,
        R.drawable.img_alphabet_8,
        R.drawable.img_alphabet_9,
        R.drawable.img_alphabet_10,
        R.drawable.img_alphabet_11,
        R.drawable.img_alphabet_12,
        R.drawable.img_alphabet_13,
        R.drawable.img_alphabet_14,
        R.drawable.img_alphabet_15,
        R.drawable.img_alphabet_16,
        R.drawable.img_alphabet_17,
        R.drawable.img_alphabet_18,
        R.drawable.img_alphabet_19,
        R.drawable.img_alphabet_20,
        R.drawable.img_alphabet_21,
        R.drawable.img_alphabet_22,
        R.drawable.img_alphabet_23,
        R.drawable.img_alphabet_24,
        R.drawable.img_alphabet_25,
        R.drawable.img_alphabet_26,
    )








    val listStoryVN: ArrayList<Story> = arrayListOf(
        Story("https://cdn3.dhht.vn/wp-content/uploads/2022/12/30-bo-truyen-co-tich-viet-nam-hay-nhat-cho-be-thich-me-5.jpg",
        "Tấm Cám",
        "Tấm là một cô gái hiền lành, xinh đẹp nhưng mồ côi mẹ từ sớm. Sau khi bố mất, Tấm phải sống cùng mụ dì ghẻ ác độc và em gái tên là Cám. Nàng bị hành hạ, đánh đập và ngược đãi mỗi ngày.\n" +
                "\n" +
                "Tất cả công việc trong nhà từ trong ra ngoài đều do một tay Tấm lo hiệu. Cám thì được cưng chiều, yêu thương. Trong khi đó, Tấm làm lụng vất vả nhưng luôn bị mẹ con ả ta đánh đập, ức hiếp.\n" +
                "\n" +
                "30 bộ truyện cổ tích Việt Nam hay nhất, cho bé thích mê - Ảnh 4\n" +
                "\n" +
                "Truyện cổ tích Việt Nam Tấm Cám\n" +
                "\n" +
                " \n" +
                "\n" +
                "Vào mỗi lần Tấm khóc Bụt sẽ hiện lên an ủi và giúp đỡ nàng. Vào một ngày nọ, trong làng có tổ chức lễ hội tuyển vợ cho vua. Nhờ vào sự giúp đỡ của Bụt Tấm đã trở thành hoàng hậu.\n" +
                "\n" +
                "Nhưng mẹ con nhà Cám vẫn không buông tha, tìm cách giết nàng để Cám làm hoàng hậu. Sau khi chết, Tấm lần lượt hóa thân thành chim vàng anh, cây xoan đào, khung cửi, quả thị nhưng đều bị mẹ con Cám hãm hại. \n" +
                "\n" +
                "Cuối cùng nàng Tấm đã trở về đoàn tụ với nhà vua. Còn mẹ con Cám thì bị trừng phạt thích đáng vì tội ác mình gây ra.\n" +
                "\n" +
                "Ý nghĩa rút ra:\n" +
                "\n" +
                "Câu chuyện cổ tích của mẹ kế và người em độc ác muốn nhắn nhủ đến các em rằng. Trong cuộc sống, những người ăn ở hiền lành, tốt bụng sẽ được ông trời, thần Phật giúp đỡ và chở che.\n" +
                "\n" +
                "Ý nghĩa rút ra từ Tấm Cám truyện cổ tích - Ảnh 5\n" +
                "\n" +
                "Ý nghĩa rút ra từ Tấm Cám truyện cổ tích\n" +
                "\n" +
                " \n" +
                "\n" +
                "Còn những ai sống ác, tìm cách hãm hại người khác sớm muộn cũng sẽ nhận phải báo ứng mà mình đã gây ra. Người “Ở hiền ắt sẽ gặp lành” đó là quy luật của cuộc sống."),
        Story("https://cdn3.dhht.vn/wp-content/uploads/2022/12/30-bo-truyen-co-tich-viet-nam-hay-nhat-cho-be-thich-me-6.jpg",
            "Cây Khế",
            "Tóm tắt nội dung:\n" +
                    "\n" +
                    "Ngày xửa ngày xưa trong một gia đình nọ, sau khi cha mẹ mất sớm và đã để lại cho hai anh em khối gia tài. Vợ chồng người anh tham lam giành hết chỉ chia cho người em một mảnh vườn nhỏ có cây khế.\n" +
                    "\n" +
                    "Vợ chồng người em không hề oán trách người anh, chăm chỉ làm việc và chăm sóc cây khế chu đáo. Mùa khế đến, cây cho rất nhiều quả to và mọng nước, ngọt. Nhưng bỗng có một con đại bàng đến ăn khế.\n" +
                    "\n" +
                    "Truyện cổ tích Cây khế - Ảnh 6\n" +
                    "\n" +
                    "Truyện cổ tích cho bé Cây khế\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Thấy vậy người em than khóc, kể khổ và đại bàng liền bảo “Ăn một quả, trả một cục vàng, may túi ba gang, mang theo mà đựng”. Sau khi ra đảo lấy vàng về người em trở nên giàu có nhất vùng.\n" +
                    "\n" +
                    "Hay tin người anh tiền lân la đến dò hỏi và đổi cả gia tài của mình để đổi lấy mảnh vườn có cây khế. Mùa khế chín lại đến, chim đại bàng lại đến ăn và cũng câu nói như lần trước.\n" +
                    "\n" +
                    "Bản tính tham lam nên người anh đã lấy rất nhiều vàng. Và kết quả trên đường về vì quá nặng nên chim đã thả người anh rơi xuống biển và chết.\n" +
                    "\n" +
                    "Đọc truyện cổ tích thiếu nhi cho bé nghevề câu chuyện Ăn khế trả vàng - Ảnh 7\n" +
                    "\n" +
                    "Đọc truyện cổ tích thiếu nhi cho bé nghe trước khi ngủ về câu chuyện Ăn khế trả vàng\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Ý nghĩa rút ra:\n" +
                    "\n" +
                    "Ở đời không nên sống tham lam, ích kỷ nếu không sẽ phải trả cái giá thật đắt như cái kết của người anh trong truyện. Đồng thời, khuyên con người chúng ta hãy luôn làm việc siêng năng, chăm chỉ sẽ gặt hái được quả ngọt. “Trời không phụ lòng người”."),
        Story("https://cdn3.dhht.vn/wp-content/uploads/2022/12/30-bo-truyen-co-tich-viet-nam-hay-nhat-cho-be-thich-me-11.jpg",
            "Thánh Gióng",
            "Tóm tắt nội dung:\n" +
                    "\n" +
                    "Vào đời vua Hùng Vương thứ sáu, ở ngôi làng Gióng có hai vợ chồng hiền lành, tốt bụng sống với nhau nhưng không có con. Ngày nọ khi ra đồng, nhìn thấy một vết chân to khổng lồ, bà vợ thấy vậy liền đặt chân vào ướm thử.\n" +
                    "\n" +
                    "Không ngờ sau khi về nhà bã đã mang thai và sau 12 tháng bã đã sinh ra một cậu bé khôi ngô tuấn tú. Nhưng lên 3 tuổi vẫn chưa biết biết đi, không biết nói biết cười.\n" +
                    "\n" +
                    "Mãi đến khi có sứ giả loan tin tìm người đánh giặc Ân thì lúc này Thánh Gióng mới cất tiếng nói đầu tiên. Xin vua làm một con ngựa sắt, một áo giáp sắt, roi sắt để đi đánh giặc. Sau hôm ấy, Gióng lớn nhanh như thổi.\n" +
                    "\n" +
                    "Truyện cổ tích Việt Nam Thánh Gióng - Ảnh 10\n" +
                    "\n" +
                    "Truyện cổ tích Việt Nam Thánh Gióng\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Cơm ăn mấy cũng chả no, áo vừa mặc liền đứt chỉ. Khi nghe tin giặc đến chân núi cậu bé bỗng vươn vai trở thành tráng sĩ to lớn, khỏe mạnh và xông lên giết giặc. Roi sắt gãy Gióng nhổ bụi tre ven đường quét tan quân giặc.\n" +
                    "\n" +
                    "Thánh Gióng đánh giặc xong cởi bỏ áo giáp sắt và cưỡi ngựa bay về trời. Vua Hùng nhớ công ơn Thánh Gióng nên đã lập đền thờ tại quê nhà và phong là Phù Đổng Thiên Vương.\n" +
                    "\n" +
                    "Ý nghĩa rút ra:\n" +
                    "\n" +
                    "Sức mạnh của Thánh Gióng chính là sức mạnh của tinh thần đoàn kết chống giặc ngoại xâm của toàn dân tộc Việt Nam. Bên cạnh đó, truyền thuyết cũng nói lên sức mạnh tiềm tàng, ẩn sâu bên trong những con người kỳ dị."),
        Story("https://cdn3.dhht.vn/wp-content/uploads/2022/12/30-bo-truyen-co-tich-viet-nam-hay-nhat-cho-be-thich-me-22.jpg",
            "Chú Cuội",
            "Tóm tắt nội dung:\n" +
                    "\n" +
                    "Thuở xa xưa có một anh chàng tiều phu tên là Cuội. Một hôm nọ, khi đi vào rừng đốn củi Cuội vô tình phát hiện hổ mẹ đã mớm cho hổ con một loại lá. Bỗng nhiên hổ con vẫy đuôi rồi sống lại.\n" +
                    "\n" +
                    "Chờ hổ mẹ tha con đi chỗ khác, Cuội đã đi đến đào cây thuốc quý về nhà. Từ khi có cây thuốc quý, Cuội cứu sống được rất nhiều mạng người nhờ lá của cây. Tuy nhiên, sau khi vợ Cuội bị bệnh tỉnh lại thì mắc chứng hay quên.\n" +
                    "\n" +
                    "Truyện cổ tích chú cuội - Ảnh 21\n" +
                    "\n" +
                    "Truyện cổ tích chú cuội\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Vì quên lời chồng dặn nên vợ Cuội đã tưới nước bẩn lên cây thuốc quý. Cây thuốc liền bứng gốc và bay lên trời. Thấy vậy Cuội túm lấy rễ cây và bay theo cây thuốc lên cung trăng.\n" +
                    "\n" +
                    "Ý nghĩa rút ra:\n" +
                    "\n" +
                    "Câu chuyện muốn đem đến cho bạn trẻ những góc nhìn sáng tạo và thú vị về ước mơ chinh phục vũ trụ rộng lớn. Đồng thời giúp chúng ta hiểu được rằng cuộc sống của mỗi người đều hữu hạn, chỉ sống một lần trên đời.\n" +
                    "\n" +
                    "Vì vậy phải biết trân quý cuộc sống hiện tại, trân quý quá khứ và hướng tới tương lai tươi sáng, tốt đẹp hơn.\n" +
                    "\n" +
                    "Ý nghĩa truyện cổ tích Việt chú Cuội - Ảnh 22\n" +
                    "\n" +
                    "Ý nghĩa truyện cổ tích Việt chú Cuội"),
        Story("https://anh.eva.vn/upload/1-2017/images/2017-03-01/truyen-co-tich-su-tich-dua-hau-1476097767_su-tich-qua-dua-hau-2-1488355127-width500height540.jpg",
            "Cổ tích trái dưa hấu",
            "Tóm tắt nội dung\n" +
                    "\n" +
                    "Vào đời vua Hùng thứ mười bảy có một người con nuôi tên là Mai An Tiêm. Anh chàng vô cùng nhanh nhẹn, thông minh, chăm chỉ nên được Đức Vua hết mực yêu thương. \n" +
                    "\n" +
                    "Tuy nhiên vì An Tiêm cho rằng “của biếu là của lo, của cho là của nợ” nên Vua vô cùng tức giận. Sau đó đã đày cả nhà Mai An Tiêm ra ngoài đảo hoang. \n" +
                    "\n" +
                    "Sự tích dưa hấu - Ảnh 29\n" +
                    "\n" +
                    "Truyện cổ tích dưa hấu\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Bằng trí thông minh và nhanh nhẹn của mình Mai An Tiêm đã trồng được quả lạ. Bên ngoài có màu xanh thẩm, bên trong đỏ mọng và có vị ngọt. Anh chàng đã đổi lấy loại trái cây này với các tàu buôn để lấy gạo và muối cho gia đình.\n" +
                    "\n" +
                    "Vua cha sau khi nghe tin rất ngạc nhiên và khâm phục tinh thần của Mai An Tiêm. Vì vậy đã sai người đến đảo hoang đón họ về cung. Sau khi về Mai An Tiêm đã phân phát hạt giống do dân chúng và đó là quả dưa hấu chúng ta thường ăn ngày nay.\n" +
                    "\n" +
                    "Truyện cổ tích quả dưa hấu - Ảnh 30\n" +
                    "\n" +
                    "Truyện cổ tích quả dưa hấu\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Ý nghĩa rút ra\n" +
                    "\n" +
                    "Qua câu chuyện trên chúng ta có thể thấy rằng sự cố gắng, nỗ lực làm việc không bao giờ là vô ích. Mặc dù trải qua biết bao nhiêu là khó khăn, khổ cực nhưng chỉ cần cần cù, siêng năng thì sẽ gặt hái được quả ngọt."),
        Story("https://product.hstatic.net/200000059004/product/image_195509_1_3668_f8829966048c4d7797c36b944d7e85d7_grande.jpg",
            "Bánh chưng bánh dày",
            "Tóm tắt nội dung\n" +
                    "\n" +
                    "Đời vua Hùng thứ sáu, lúc về già nhà Vua có ý định truyền ngôi cho các con của mình. Để có thể tìm ra được người phù hợp nhất với ngôi vị này. Nhân lễ cúng Tiên vương, nhà Vua đã ra lệnh nếu ai dâng lễ vật cúng vừa ý thì sẽ truyền ngôi.\n" +
                    "\n" +
                    "Các hoàng tử lập tức sai người lên đường tìm của ngon vật lạ quý hiếm trên rừng dưới biển. Duy nhất chỉ có Lang Liêu – người con trai thứ mười tám không biết phải làm thế nào. Từ nhỏ anh đã quen với việc đồng áng nên không biết tìm lễ vật từ đâu.\n" +
                    "\n" +
                    "Truyện về Bánh chưng Bánh dày - Ảnh 31\n" +
                    "\n" +
                    "Truyện cổ tích Việt Nam hay về Bánh chưng Bánh dày\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Một đêm nằm mộng, Lang Liêu mơ thấy có một vị thần đến mách bảo rằng hãy làm bánh từ gạo nếp, đậu xanh và thịt lợn. Một loại bánh hình tròn tượng trưng cho trời và bánh hình vuông tượng trưng cho đất.\n" +
                    "\n" +
                    "Ngày dâng lễ vật đã đến, chỉ có bánh của Lang Liêu là Vua cha ưng ý nhất và chọn làm lễ vật tế lễ. Và truyền ngôi lại cho Lang Liêu. Kể từ đó về sau, việc gói bánh chưng bánh tét bánh dày trở thành truyền thống quý báu của người dân Việt vào lễ, tết.\n" +
                    "\n" +
                    "YouTube video\n" +
                    " \n" +
                    "\n" +
                    "Kể truyện cổ tích cho bé về sự tích Bánh chưng bánh dày\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Ý nghĩa rút ra\n" +
                    "\n" +
                    "Truyện đã phản ánh thành tựu văn minh nông nghiệp của nước ta vào buổi đầu xây dựng đất nước. Đề cao lòng hiếu thảo, tôn kính Trời, Đất tổ tiên của những người lao động đối với những giá trị truyền thống tốt đẹp."),
        Story("https://salt.tikicdn.com/cache/w1200/media/catalog/product/b/i/bia_su_tich_ho_guom.jpg",
            "Hồ Gươm",
            "Tóm tắt nội dung\n" +
                    "\n" +
                    "Truyện kể về việc Long Quân cho Lê Lợi và nghĩa quân Lam Sơn mượn gươm thần để đánh đuổi giặc Minh.  Một người dân đánh cá tên là Lê Thận trong 3 lần kéo lưới đều kéo vào một thanh sắt. Nhưng nhìn kỹ đó là một thanh gươm.\n" +
                    "\n" +
                    "Sau đó, khi bị giặc đuổi đánh Lê Lợi đã chạy vào rừng sâu và thấy được một chuôi gươm nạm ngọc ở trên cây đa. Lưỡi gươm và chuôi gươm sau khi tra vào nhau thì vừa như in. Lúc bấy giờ vua Lê Lợi mới biết đó chính là gươm thần.\n" +
                    "\n" +
                    "Truyện cổ tích lịch sử Việt Nam Hồ Gươm - Ảnh 34\n" +
                    "\n" +
                    "Truyện cổ tích lịch sử Việt Nam Hồ Gươm\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Từ lúc sau khi có thanh gươm, nghĩa quân của ta đánh đến đâu thắng đến đó. Đánh tan quân xâm lược. Một năm sau khi thắng trận, Lê Lợi dạo thuyền rồng trên hồ Tả Vọng thì có một con Rùa Vàng ngoi lên đòi lại gươm thần.\n" +
                    "\n" +
                    " Kể từ đó về sau, hồ tả Vọng được đổi tên thành hồ Hoàn Kiếm hay còn được gọi là Hồ Gươm như ngày nay.\n" +
                    "\n" +
                    "Ý nghĩa rút ra\n" +
                    "\n" +
                    "Truyền thuyết đã ca ngợi, đề cao tinh thần đánh đuổi giặc Minh của vua Lê Lợi ra khỏi đất nước. Thể hiện được ước muốn của nhân dân ta về một cuộc sống hòa bình, ấm no và hạnh phúc."),
        Story("https://kenosa.vn/app_images/product/2012/6/25/su-tich-trau-cau-truyen-co-tich-dan-gian-viet-nam-21159-500-21159.jpg",
            "Sự tích trầu cau",
            "Tóm tắt nội dung\n" +
                    "\n" +
                    "Ngày xưa ở một ngôi làng nọ có hai anh em sinh đôi giống nhau như hai giọt nước. Người anh tên là Tân và người em tên là Lang. Hai anh em hết mực yêu thương, chăm sóc nhau.\n" +
                    "\n" +
                    "Nhưng sau khi người anh cưới vợ thì tình cảm anh em không còn thắm thiết như xưa. Một hôm hai anh em đi làm tối mịt mới về đến nhà. Người em vô nhà trước, chị dâu tưởng là chồng mình nên ôm chầm lấy.\n" +
                    "\n" +
                    "Kho tàng truyện cổ tích cho bé về Sự tích trầu cau - Ảnh 41\n" +
                    "\n" +
                    "Kho tàng truyện cổ tích cho bé về Sự tích trầu cau\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Vừa lúc ấy, người anh đã bước vào chứng kiến nên càng tức giận và lạnh nhạt với người em hơn. Người em vì cảm thấy buồn tủi nên đã bỏ nhà ra đi. Đi đến bên dòng sông người em ngồi khóc và sau đó đã hóa thành đá. \n" +
                    "\n" +
                    "Người anh đi kiếm em mãi không thấy nên tựa vào tảng đá than khóc. Cuối cùng hóa thành cây cau. Người vợ cũng vì lo lắng cho chồng mà vội vã đi kiếm. Nàng tựa vào gốc cây cau mà khóc thảm thiết và kết cục là biến thành dây trầu quấn lấy thân cau.\n" +
                    "\n" +
                    "Sự tích trầu cau - Truyện cổ tích dân gian Việt Nam - Ảnh 42\n" +
                    "\n" +
                    "Sự tích trầu cau – Truyện cổ tích dân gian Việt Nam\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Ý nghĩa rút ra\n" +
                    "\n" +
                    "Câu chuyện cổ tích này cho thấy được tình cảm yêu thương quý giá anh em trong một gia đình. Tình cảm thủy chung son sắt của lứa đôi, vợ chồng gắn bó keo sơn đến khi đầu bạc, răng long."),
    )

    val listStoryForeign:ArrayList<Story> = arrayListOf(Story("https://product.hstatic.net/200000343865/product/co-be-quang-khan-do_0_3b80ad2539ad4e52baa02bd0188963ce_master.jpg",
        "Cô bé quàng khăn đỏ",
        "Truyện kể về một cô bé, gọi là cô bé quàng khăn đỏ, đi vào rừng để đến nhà bà đưa thức ăn cho người bà đang bị bệnh. Dù đã được mẹ dặn dò rất kỹ trước khi đi nhưng vì mải mê đuổi bắt hoa bướm cô bé đã quên những lời nói của mẹ và sau đó cô bé đã bị một con sói gian ác theo dõi lập kế hoạch để ăn thịt cô.\n" +
                "\n" +
                "Con sói hỏi cô bé đang đi đâu và cô đã ngây thơ trả lời, sau đó, con sói bảo cô bé đi hái hoa.Trong lúc đó, sói đến nhà ăn thịt người bà và đóng giả thành bà của cô bé quàng khăn đỏ.\n" +
                "\n" +
                "Khi cô bé đến nhà bà và cũng sắp bị con sói kia ăn thịt thì thật may có bác thợ săn đi ngang qua vô tình nhìn thấy lập tức giết chết con sói hung ác và sau đó mổ bụng con sói ra để cứu bà của cô bé. Thật may mắn khi cả hai bà cháu đều thoát nạn, kể từ đó trở đi cô bé quàng khăn đỏ không bao giờ dám làm trái những lời mẹ dặn nữa.\n" +
                "\n" +
                "Câu chuyện nhằm giáo dục các bé phải biết ngoan ngoãn, vâng lời cha mẹ ông bà. Các bé phải luôn luôn ghi nhớ và làm theo những lời người lớn căn dặn, không nên ham chơi và không được nghe theo những lời dụ dỗ của người lạ vì như vậy sẽ dễ gặp phải nguy hiểm giống như cô bé quàng khăn đỏ vậy."),
        Story("https://toplist.vn/images/800px/bai-van-hoa-than-vao-nhung-que-diem-ke-lai-cau-chuyen-co-be-ban-diem-ngu-van-8-hay-nhat-609162.jpg",
            "Cô bé bán diêm",
            "Cô bé bán diêm là truyện cổ tích do nhà văn người Đan Mạch Hans Christian Andersen sáng tác. Câu chuyện kể về một đứa trẻ nghèo khổ phải đi bán diêm giữa thời tiết giá lạnh trong đêm Giáng Sinh. Cô bé đáng thương phải chịu cảnh đói rét và phải lê những bước chân dài nặng nề trên đường để mong có thể bán được vài hộp diêm nhỏ nhưng mãi vẫn không bán được.\n" +
                    "\n" +
                    "Trong đêm đông giá lạnh, tuyết rơi phủ trắng cô bé tội nghiệp ngồi dưới một gốc tường trên đường phố và lấy hết can đảm để quẹt những que diêm lên sưởi ấm. Khi những que diêm bùng cháy cô bé đã mơ tưởng về những hạnh phúc mà em ao ước cùng với người bà quá cố của mình.\n" +
                    "\n" +
                    "\n" +
                    "Buổi sáng hôm sau, người ta thấy một em bé ngồi giữa những bao diêm trong đó có một bao diêm đốt hết nhẵn. Người ta bảo cô bé đã chết nhưng đôi má vẫn ửng hồng và đôi môi em đang mỉm cười.\n" +
                    "\n" +
                    "Đoạn cuối theo lời người kể chuyện: “Chắc là con bé muốn được ấm áp” – mọi người nói. Không ai biết được những điều đẹp đẽ mà em đã thấy, và em đã hạnh phúc như thế nào khi đi cùng bà ngoại vào năm mới tươi sáng.\n" +
                    "\n" +
                    "Câu chuyện Cô bé bán diêm đã để lại ấn tượng khó phai trong lòng người đọc, giáo giáo dục cho con người lòng nhân ái tình yêu thương trẻ em và những ước mơ khát khao của các em rất trong sáng và đẹp đẽ thể hiện sự trong trẻo hồn nhiên của trẻ thơ mà đôi khi người lớn không bao giờ nghĩ tới."),
        Story("https://salt.tikicdn.com/cache/w1200/ts/product/cb/e0/1b/d60be87ad3eed4112fd8ca8cbe1dbd4e.jpg",
            "Aladdin và cây đèn thần",
            "Câu chuyện xoay quanh nhân vật chính là chàng trai có tên là Aladdin, sống cùng với người mẹ góa tên là Mustapha tại kinh đô của một đất nước nọ.\n" +
                    "\n" +
                    "Năm Aladdin 15 tuổi, có một lão phù thủy cao tay cất công từ châu Phi sang, làm quen với mẹ con Aladdin để thực hiện một mưu đồ to lớn của lão. Lão dụ dỗ Aladdin đến một cái hầm bí mật lấy cho lão cái đèn dầu “cũ kĩ” nằm trong đó. Khi lấy được rồi, vì Aladdin không chịu đưa cây đèn nên lão phù thủy tức giận đọc thần chú bịt kín miệng hầm để nhốt Aladdin.\n" +
                    "\n" +
                    "Cái nhẫn thần mà lão phù thủy đưa cho Aladdin trước khi vào xuống hầm đã giúp Aladdin thoát khỏi hang. Có cây đèn thần trong tay, cuộc sống của mẹ con Aladdin đã khá hơn trước. Đến năm 18 tuổi, bằng sự trợ giúp đắc lực của Thần đèn (Jinni), Aladdin đã cưới được công chúa Badroulbadour.\n" +
                    "\n" +
                    "Nhiều năm trôi qua, lão phù thủy phát hiện Aladdin vẫn còn sống và sống rất hạnh phúc bên nàng công chúa xinh đẹp. Lão bèn quyết lấy cho bằng được cây đèn thần. Nhờ mưu mẹo, lão dễ dàng đoạt được cây đèn thần của Aladdin. Lão bắt cóc công chúa và sai Thần đèn lấy tất cả của cải đem sang châu Phi, ép công chúa phải lấy lão.\n" +
                    "\n" +
                    "Mất cây đèn thần, Aladdin tiếp cận công chúa nhờ vào Thần nhẫn. Hai người lập mưu lấy lại cây đèn. Công chúa mưu lược đã dụ lão phù thủy uống thuốc độc rồi chết. Thế là Aladdin lấy lại được cây đèn thần và rước công chúa về sống. Cả hai từ nay cũng không cần Thần đèn giúp đỡ nữa và họ quyết định cho Thần đèn được tự do.\n" +
                    "\n" +
                    "Truyện ca ngợi sự mưu trí, lòng dũng cảm và giúp bé thêm ham thích khám phá bao điều diệu kỳ từ thế giới xung quanh."),
        Story("https://product.hstatic.net/1000219449/product/c__b__l__lem_753d511173d04beb95eb484ac00ceec0_master.jpg",
            "Cô bé Lọ Lem",
            "Truyện kể về một cô bé nhỏ nhắn, xinh đẹp tên là Lọ Lem, mẹ mất sớm cô bé phải sống cùng với người mẹ kế và hai người con riêng của bà ta đều có bụng dạ xấu xa đen tối. Cuộc sống của Lọ Lem vô cùng khốn khổ, cô bị mẹ kế đối xử vô cùng tệ bạc, bà ta cùng với hai đứa con gái của mình ra sức hành hạ đánh đập, bắt Lọ Lem phải làm tất cả mọi việc như một người ở.\n" +
                    "\n" +
                    "Nhưng nhờ đức tính hiền hậu, dịu dàng, ngoan ngoãn của mình Lọ Lem đã được bà tiên ra tay phù trợ giúp đỡ cô vượt qua mọi sự hãm hại của bà mẹ kế và đến được buổi kén vợ của Hoàng tử. Sau đó Lọ Lem đã kết hôn và sống hạnh phúc bên Hoàng tử trong lâu đài nguy nga.\n" +
                    "\n" +
                    "Còn về phần hai người con riêng của bà mẹ kế vừa không lấy được Hoàng tử mà còn bị chim mổ cho mù mắt vì bị trừng phạt do tội ác mà họ đã gây ra.\n" +
                    "\n" +
                    "Câu chuyện Cô bé Lọ Lem là một câu chuyện hay và vô cùng ý nghĩa, giáo dục các bé phải nên yêu thương và đối xử tốt với mọi người xung quanh. Không nên có thói xấu đố kị và gian dối người khác vì như vậy là không ngoan trở thành đứa trẻ hư và sẽ không được mọi người yêu quý."),
        Story("https://nhasachminhthang.vn/UserFiles/files/Thi%E1%BA%BFu%20Nhi/n%C3%A0ng%20b%E1%BA%A1ch%20tuy%E1%BA%BFt.png",
            "Nàng Bạch Tuyết và bảy chú lùn",
            "Tại một vương quốc nọ có bà hoàng hậu ngày đêm ao ước đẻ được một cô công chúa xinh đẹp và không lâu sau bà đã hạ sinh được cô công chúa da trắng như tuyết, môi đỏ như son và tóc đen như gỗ mun nên bà đã đặt tên là Bạch Tuyết.\n" +
                    "\n" +
                    "Khi đứa trẻ vừa ra đời thì hoàng hậu cũng qua đời. Và rồi nhà vua lại có thêm vợ mới xinh đẹp nhưng tính tình lại kiêu ngạo và ngông cuồng. Bà ta đố kỵ với sắc đẹp của Bạch Tuyết và cho người giết hại nàng. Nhưng vì quá đáng thương nên công chúa đã được thả trốn vào rừng sâu và lạc tới nhà của 7 chú lùn.\n" +
                    "\n" +
                    "Một thời gian sau, nhờ gương thần mụ ta biết Bạch Tuyết còn sống và không thể chịu được vì Bạch Tuyết xinh đẹp hơn mình nên đã đem táo độc đến cho nàng ăn để hãm hại nàng một lần nữa.\n" +
                    "\n" +
                    "Cuối truyện Bạch Tuyết nhờ có Hoàng tử yêu thương nàng bằng tình yêu thật sự đã vô tình cứu nàng sống trở lại.Còn bà Hoàng hậu độc ác thì bị nhà vua trừng phạt cho đến chết, trả giá cho những tội lỗi mà bà ta đã gây nên.\n" +
                    "\n" +
                    "Câu chuyện Nàng Bạch Tuyết và bảy chú lùn là sự khẳng định một đạo lý của tình người sẽ mang đến một cái kết có hậu và tuyệt đẹp. Trước nàng công chúa xinh đẹp và có trái tim thánh thiện thì mọi kẻ thù đều bị khuất phục và mọi âm mưu tội lỗi đều thất bại."),
        Story("https://product.hstatic.net/200000122283/product/image_244718_1_2832_4ba11c340c6e4db6a09a4dc60edbb3ec_grande.jpg",
            "Ông lão đánh cá và con cá vàng\n",
            "Ông lão đánh cá và con cá vàng kể về câu chuyện một ông lão nghèo làm nghề đánh cá ngoài biển.\n" +
                    "\n" +
                    "Một hôm, ông đi ra biển, lần thứ nhất ông kéo lưới, vớt lên ông chỉ thấy có bùn. Lần tiếp theo ông kéo lưới cũng chỉ thấy rong rêu. Vào lần thứ ba, ông lão tiếp tục kéo lưới và bắt được một con cá vàng. Lúc đó, cá vàng tha thiết van xin ông lão thả ra và hứa sẽ trả ơn cho ông, thương chú cá, ông lão thả cá trở lại về với biển.\n" +
                    "\n" +
                    "Về đến nhà, ông lão kể lại câu chuyện của mình và chú cá vàng cho mụ vợ nghe, sau một thôi một hồi mắng ông lão vì tội ngu ngốc, mụ bắt ông lão ra gặp cá vàng để bắt cá vàng trả ơn. Bởi lòng tham, mụ vợ đòi cá trả ơn, hết lần này đến lần khác, do lòng tham ngày càng quá quắt, kết cục ông lão thấy mụ vợ quay về bên máng lợn sứt mẻ.\n" +
                    "\n" +
                    "Truyện có ý nghĩa giáo dục chúng ta cần biết ơn những người đã giúp đỡ mình khi hoạn nạn, khó khăn. Không nên tham lam, bội bạc, đừng vì vật chất và danh vọng mà đánh mất tình người."),
        Story("https://newshop.vn/public/uploads/products/34487/sach-truyen-song-ngu-anh-viet-hoang-tu-ech.jpg",
            "Hoàng tử ếch",
            "Chuyện kể về một chàng hoàng tử bị dính lời nguyện của mụ phù thủy độc ác nên đã biến thành một con ếch xấu xí nằm ở giếng sâu.\n" +
                    "\n" +
                    "Một hôm nàng công chúa xinh đẹp đánh rơi quả cầu vàng yêu thích của mình xuống một cái giếng sâu. Bỗng đâu có một con ếch xấu xí tìm lại quả cầu giúp nàng rồi nằng nặc đòi làm bạn tốt của nàng trong khi công chúa chẳng ưa gì chú ếch. Vì rất muốn lấy lại quả cầu và nghĩ làm sao con ếch có thể lên được nên công chúa giả vờ đồng ý nhưng sau đó bỏ chạy mất.\n" +
                    "\n" +
                    "Con ếch đi đến lâu đài của công chúa và yêu cầu công chúa thực hiện lời hứa. Mặc dù không ưa ếch nhưng công chúa không dám cãi lời vua cha vì phải giữ đúng lời hứa nên công chúa đành chấp nhận.\n" +
                    "\n" +
                    "Kết chuyện con ếch xấu xí đã lột xác hóa thân thành một chàng thanh niên khôi ngô tuấn tú là Hoàng tử ếch và sống hạnh phúc bên công chúa xinh đẹp.\n" +
                    "\n" +
                    "Câu chuyện muốn nhắc nhở chúng ta phải nên giữ đúng lời hứa mà mình đã nói ra đặc biệt là với những người đã giúp mình thì càng phải biết trân trọng. Nếu như không thể thực hiện thì chúng ta không nên hứa bất cứ điều gì. Và đừng chỉ nhìn vẻ bề ngoài mà vội đánh giá chê bai một người nào khác, hãy tôn trọng và nhìn vào vẻ đẹp bên trong con người của họ."),
        Story("https://www.nxbtre.com.vn/Images/Book/NXBTreStoryFull_21442015_104425.jpg",
            "Nàng công chúa ngủ công rừng",
            "Chuyện kể về một nàng công chúa xinh đẹp có tên là là Aurora.Vào ngày cô sinh ra đời, hoàng hậu và quốc vương vô cùng vui mừng và hạnh phúc đã mở yến tiệc linh đình mời tất cả mọi người cùng các bà mụ đến dự để cùng chúc những điều tốt lành dành cho cô công chúa bé nhỏ.\n" +
                    "\n" +
                    "Tuy nhiên vì quá vui mừng, hòang hậu đã thiếu sót khi quên mất không mời bà mụ thứ mười ba khiến cho bà ta giận dữ và ra lời nguyện độc ác dành cho cô. Cuối truyện công chúa đã gặp được chàng Hoàng tử yêu cô thật lòng và đã giải cứu được công chúa. Họ sống vui vẻ hạnh phúc bên nhau đến trọn đời."),
        )

//    Story("",
//    "Tấm Cám",
//    "Mô tả"),

}