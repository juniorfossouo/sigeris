package cm.sigeris.sigeris1.appClient

import cm.sigeris.sigeris1.model.Categories
import cm.sigeris.sigeris1.model.LoginModel
import cm.sigeris.sigeris1.model.Products
import cm.sigeris.sigeris1.model.UserModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

interface AppApi {
    @POST("/auth/login")
    suspend fun login(@Body() user : LoginModel): UserModel
    @GET("/products")
    suspend fun getProducts():  Response<Products>
    @GET("/products/{prodId}")
    suspend fun getOneProducts(@Path("prodId") prodId: String ): Response<Products.Product>
    @GET("products/categories")
    suspend fun getProductsCategories(): Response<Categories>
    @GET("products/category/{catName}")
    suspend fun getProductsByCategories(@Path("catName") catName: String ): Response<Products>
}