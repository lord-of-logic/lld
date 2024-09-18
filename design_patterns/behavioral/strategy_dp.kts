//Strategy Interface
interface DoSomethingStrategy {
    fun doSomething()
}

//Strategy concrete implementation
class FirstStrategy : DoSomethingStrategy {
    override fun doSomething() {
        println("First strategy")
    }
}

class SecondStrategy : DoSomethingStrategy {
    override fun doSomething() {
        println("Second strategy")
    }
}

//Strategy Context
class DoSomethingContext {
    private lateinit var doSomethingStrategy: DoSomethingStrategy

    fun setDoSomethingStrategy(doSomethingStrategy: DoSomethingStrategy): DoSomethingStrategy {
        this.doSomethingStrategy = doSomethingStrategy
        return this.doSomethingStrategy
    }

    fun doSomething() {
        doSomethingStrategy.doSomething()
    }
}

//Client
fun main() {
    val inputStrategy = "First"
    val strategyContext = 
        if (inputStrategy == "First")
            DoSomethingContext().setDoSomethingStrategy(FirstStrategy())
        else
            DoSomethingContext().setDoSomethingStrategy(SecondStrategy())
    strategyContext.doSomething()
}
