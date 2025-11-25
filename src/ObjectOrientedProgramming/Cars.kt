package ObjectOrientedProgramming
/*
Kotlinda getter va setter shunchaki field ning ostidan 4 ta probel qoldirilib e'lon qilinadi
setterni tashqaridan o'zgartirilmaydigan qilish uchun uni private qilish kifoya

getterdagi field kalit so'zi bu getter uchun shu qiymatning o'zi ekanligini bildiradi (state)

setterdagi value bu tashqaridan argument sifatida berib yuborilgan qiymat ekanligini bildiradi


 */
class Cars {
    var name : String? = null
     var model : Int? = null
         get() = field ?: 0
         private set(value){
            field = value?.times(2) // 2 marta ko'paytirib saqlaydi qiymatga
        }


}