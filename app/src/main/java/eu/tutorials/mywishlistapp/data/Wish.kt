package eu.tutorials.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "An android watch"),
        Wish(title = "Samsung S23", description = "An android phone"),
        Wish(title = "Sony WH1000XM5", description = "A Headphone ")
    )
}