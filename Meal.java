package sample;

// import java.util.List;

class Meal {
    // @SerializedName("strMeal")
    private String strMeal;

    // @SerializedName("strMealThumb")
    private String strMealThumb;

    // @SerializedName("idMeal")
    private String idMeal;
    
// 
//     public Meal(String strMeal, String strMealThumb, String idMeal) {
//         this.strMeal = strMeal;
//         this.strMealThumb = strMealThumb;
//         this.idMeal = idMeal;
//     }
// 
// 
//     public String getStrMeal() {
//         return strMeal;
//     }
// 
// 
//     public void setStrMeal(String strMeal) {
//         this.strMeal = strMeal;
//     }
// 
// 
//     public String getStrMealThumb() {
//         return strMealThumb;
//     }
// 
// 
//     public void setStrMealThumb(String strMealThumb) {
//         this.strMealThumb = strMealThumb;
//     }
// 
// 
//     public String getIdMeal() {
//         return idMeal;
//     }
// 
// 
//     public void setIdMeal(String idMeal) {
//         this.idMeal = idMeal;
//     }
// 
// 
    @Override
    public String toString() {
        return "Meal" + "\n" +
                "name = " + strMeal + "\n" +
                "thumbnail = " + strMealThumb + "\n" +
                "id = " + idMeal;
    }
}