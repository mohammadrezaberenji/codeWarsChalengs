 fun duplicateCount(text: String): Int {
        var charMetted : Char = '$'
        var array =  ArrayList<String>()

        for (i in 0..text.length - 1) {
            for (j in i..text.length - 1) {
                if (i != j) {
                    if (text[i].equals(text[j] , true)) {
                        if(charMetted != text[j] ){
                            charMetted = text[j]
                            if (!array.contains(charMetted.toString().toLowerCase())){
                                array.add(charMetted.toString())
                            }


                        }

                    }
                }
            }

        }
    	println(array)
        val array2 = array.distinctBy { it.toUpperCase() }
        println(array2)
        return array2.size
    }
