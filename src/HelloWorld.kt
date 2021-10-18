/*val nums : IntArray = intArrayOf(3,3)
val target = 6
*/

fun main(args: Array<String>){

    fun twoSum (nums : IntArray, target : Int) : IntArray  {
        var solution = intArrayOf()
        for(i in nums.indices){
            var j = i+1
            while(j< nums.size){
                if(nums[i]+nums[j]==target){
                    solution = intArrayOf(i,j)
                    break
                }
                j++
            }

        }

        if(solution.size < 1){
            return intArrayOf(-1,-1)
        }
        else return solution
    }






/*
    var lol = twoSum(nums, target)
    lol.forEach { println(it) }
*/
}