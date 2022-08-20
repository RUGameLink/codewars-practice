//DESCRIPTION:
//Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
//Return your answer as a number.

//SOLUTION
public class MixedSum {

    /*
    * Assume input will be only of Int or String type
    */
    public fun sum(mixed: List<Any>): Int {
        var numbers = mixed.map { it.toString().toInt() }
        return numbers.sum()
    }
}


