fun main(){
    /*
    --------------------------------------------------------------------------------
    Java-dagi switch-case:
switch (day) {
    case 1:
        System.out.println("Dushanba");
        break;  // break kerak!
    case 2:
        System.out.println("Seshanba");
        break;
    default:
        System.out.println("Boshqa kun");
}
    --------------------------------------------------------------------------------

Kotlin-dagi when:

when (day) {
    1 -> println("Dushanba")  // break kerak emas!
    2 -> println("Seshanba")
    else -> println("Boshqa kun")
}
--------------------------------------------------------------------------------

when ning switch-case dan afzalliklari:
1. break kerak emas
// Kotlin - avtomatik to'xtaydi
when (x) {
    1 -> println("Bir")
    2 -> println("Ikki")  // 1 ga teng bo'lsa, bu ishlamaydi
}
--------------------------------------------------------------------------------
2. Expression (qiymat qaytaradi)

// Kotlin
val result = when (x) {
    1 -> "Bir"
    2 -> "Ikki"
    else -> "Boshqa"
}
--------------------------------------------------------------------------------
// Java - bunday qila olmaysiz

3. Ko'proq turlarni qo'llab-quvvatlaydi
// Kotlin - har qanday tur
when (obj) {
    is String -> "Matn"
    is Int -> "Raqam"
    in 1..10 -> "Diapazon"
    else -> "Boshqa"
}
--------------------------------------------------------------------------------
// Java switch - faqat int, enum, String

4. Bir nechta qiymat
// Kotlin - bir qatorda
when (x) {
    1, 2, 3 -> println("Kichik")
    4, 5, 6 -> println("O'rta")
}
--------------------------------------------------------------------------------
// Java - har bir case alohida

// 5. Shartsiz ishlatish

// Kotlin - argument kerak emas
when {
    x > 0 -> "Musbat"
    x < 0 -> "Manfiy"
    else -> "Nol"
}

// Java switch - argument majburiy
--------------------------------------------------------------------------------
     */
}