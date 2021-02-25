package API_Project_Activity_1a

class API_Project_Activity_1a 
{
	static void main(def args)
	{
		def inputList = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		println inputList
		
		def integerList = inputList.minus(["Mango", "Apple", "Watermelon"])
		println integerList
		
		def stringList = inputList.minus([11, 2, 19, 5])
		println stringList
		
		
	}
}
