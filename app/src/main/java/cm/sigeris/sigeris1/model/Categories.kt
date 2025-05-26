package cm.sigeris.sigeris1.model

class Categories : ArrayList<Categories.CategoriesItem>(){
    data class CategoriesItem(
        val name: String, // Beauty
        val slug: String, // beauty
        val url: String // https://dummyjson.com/products/category/beauty
    )
}