//Implementor
interface UtensilType {
    fun doAction()
}

//Concrete Implementor
class Spoon: UtensilType {
    var utensilName: String = "Spoon"
    var utensilMaterial: String = "Steel"
    override fun doAction() {
        println("tasted using spoon")
    }
}

class Plate: UtensilType {
    var utensilName: String = "Plate"
    var utensilMaterial: String = "Silver"
    override fun doAction() {
        println("ate from plate")
    }
}

class Glass: UtensilType {
    var utensilName: String = "Glass"
    var utensilMaterial: String = "Plastic"
    override fun doAction() {
        println("drank from glass")
    }
}

//Abstracter
abstract class FoodItem {
    var utensilType: UtensilType? = null
    
}

//Refined Abstracter
class Water : FoodItem() {
    var itemName: String = "Water"
    var itemTaste: String = "None"
}
