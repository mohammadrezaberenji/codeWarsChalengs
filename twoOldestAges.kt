fun twoOldestAges(ages: List<Int>): List<Int> {
        val mutable = ages.toMutableList()
        val firstMax = mutable.max()
        var index = -1
    	for(i in 0..ages.size -1){
            if(ages[i] == firstMax){
                index = i
            }
        }
        println(index)
        mutable.removeAt(index)
        val secondMax = mutable.max() 
        return listOf(secondMax!! , firstMax!!)
    }
