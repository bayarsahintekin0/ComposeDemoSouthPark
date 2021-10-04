package com.bayarsahintekin.composedemo

import com.bayarsahintekin.composedemo.model.Characters

object DataProvider {

    val southParkList = listOf<Characters>(
        Characters (
            id = 0,
            name = "Eric Cartman",
            gender = "Male",
            age = 10,
            birthday = "July 1",
            imageUrl = "https://static.wikia.nocookie.net/southpark/images/c/c4/Eric-cartman.png/revision/latest/scale-to-width-down/350?cb=20180718082504"
        ),
        Characters (
            id = 1,
            name = "Kenneth Kenny McCormick",
            gender = "Male",
            age = 9,
            birthday = "March 22",
            imageUrl = "https://static.wikia.nocookie.net/southpark/images/6/6f/KennyMcCormick.png/revision/latest/scale-to-width-down/350?cb=20160409020502"
        ),
        Characters (
            id = 2,
            name = "Stanley Stan Marsh",
            gender = "Male",
            age = 10,
            birthday = "October 19",
            imageUrl = "https://static.wikia.nocookie.net/southpark/images/c/c6/Stan-marsh-0.png/revision/latest/scale-to-width-down/319?cb=20210107202918"
        ),
        Characters (
            id = 0,
            name = "Kyle Broflovski",
            gender = "Male",
            age = 10,
            birthday = "May 26",
            imageUrl = "https://static.wikia.nocookie.net/southpark/images/9/95/Kyle-broflovski.png/revision/latest/scale-to-width-down/350?cb=20190411033301"
        ),
        Characters (
            id = 0,
            name = "Leopold Butters Stotch",
            gender = "Male",
            age = 10,
            birthday = "September 11",
            imageUrl = "https://static.wikia.nocookie.net/southpark/images/0/06/ButtersStotch.png/revision/latest/scale-to-width-down/316?cb=20190411032405"
        ),
        Characters (
            id = 0,
            name = "Herbert Garrison",
            gender = "Male",
            age = 41,
            birthday = "Undefined",
            imageUrl = "https://static.wikia.nocookie.net/southpark/images/7/79/Mr._Herbert_Garrison.png/revision/latest/scale-to-width-down/198?cb=20181024214515"
        ),
        Characters (
            id = 0,
            name = "Randy Marsh",
            gender = "Male",
            age = 45,
            birthday = "March 1",
            imageUrl = "https://static.wikia.nocookie.net/southpark/images/e/e2/Farmer-randy.png/revision/latest/scale-to-width-down/255?cb=20181021111756"
        )
    )
}