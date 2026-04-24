package com.example.lifehackorrmyth

object QuestionData {
    private val questions = listOf(
        Question(
            id = 1,
            statement = "Placing your phone in the freezer can extend its battery life.",
            isHack = false,
            explanation = "This is a myth! Extreme cold can damage your phone's battery and components. Keep your phone at room temperature."
        ),
        Question(
            id = 2,
            statement = "Using a rubber band around a leaky pen can stop the leak.",
            isHack = true,
            explanation = "True! Wrapping a rubber band tightly around the pen barrel can help seal small leaks temporarily."
        ),
        Question(
            id = 3,
            statement = "Boiling bananas helps you fall asleep faster.",
            isHack = true,
            explanation = "True! Banana peels contain magnesium and potassium which promote relaxation. Boil and drink the water."
        ),
        Question(
            id = 4,
            statement = "Rubbing toothpaste on pimples overnight will always cure them.",
            isHack = false,
            explanation = "This is a myth! While some toothpastes have drying agents, they can irritate skin. Use proper acne treatments instead."
        ),
        Question(
            id = 5,
            statement = "Using a humidifier while sleeping can improve your productivity the next day.",
            isHack = true,
            explanation = "True! Proper humidity levels reduce respiratory issues and improve sleep quality, leading to better productivity."
        ),
        Question(
            id = 6,
            statement = "Opening both car windows while driving increases fuel consumption significantly.",
            isHack = true,
            explanation = "True! Open windows create drag and reduce aerodynamics, using more fuel compared to using air conditioning."
        ),
        Question(
            id = 7,
            statement = "You should wait 30 minutes after eating before swimming.",
            isHack = false,
            explanation = "This is a myth! There's no scientific evidence that eating before swimming causes cramps. You can swim safely after eating."
        ),
        Question(
            id = 8,
            statement = "Placing a bowl of onions in a room prevents flu transmission.",
            isHack = false,
            explanation = "This is a myth! Onions have no antiviral properties. Proper hygiene and vaccines are effective flu prevention methods."
        ),
        Question(
            id = 9,
            statement = "Using vinegar and baking soda is effective for cleaning your shower tiles.",
            isHack = true,
            explanation = "True! The chemical reaction between vinegar and baking soda helps break down soap scum and mold naturally."
        ),
        Question(
            id = 10,
            statement = "Reading in dim light will permanently damage your eyesight.",
            isHack = false,
            explanation = "This is a myth! Dim light may cause temporary eye strain, but it won't cause permanent damage to your vision."
        )
    )

    fun getQuestions(): List<Question> = questions
}
