# Life Hack or Myth?

Life Hack or Myth? is a simple Android quiz app where the user decides whether each statement is a real tip or a myth. The app gives immediate feedback, keeps score across 10 questions, and ends with a review screen that shows the explanations again.

The quiz content was written in short, plain language for the app, but it was informed by public guidance on device temperature safety, swimming myths, acne myths, flu prevention and eye strain (Apple, 2025; American Red Cross, 2024; Centers for Disease Control and Prevention, 2025; Cleveland Clinic, 2022; Mayo Clinic Staff, 2024).

## Features

* 10 quiz questions
* Immediate feedback after each answer
* Final score screen
* Review screen with explanations

## Screenshots

### Home screen

<img src="Screenshots/Screenshot%202026-04-24%20192542.png" alt="Home screen" width="260" />

### Question screen

<img src="Screenshots/Screenshot%202026-04-24%20192603.png" alt="Question screen" width="260" />

### Incorrect answer feedback

<img src="Screenshots/Screenshot%202026-04-24%20192612.png" alt="Incorrect answer feedback" width="260" />

### Correct answer feedback

<img src="Screenshots/Screenshot%202026-04-24%20192631.png" alt="Correct answer feedback" width="260" />

### Results screen

<img src="Screenshots/Screenshot%202026-04-24%20192714.png" alt="Results screen" width="260" />

### Review screen

<img src="Screenshots/Screenshot%202026-04-24%20192734.png" alt="Review screen" width="260" />

## Running the project

* Open the project in Android Studio
* Sync the Gradle files
* Run the app on an emulator or Android device

## Requirements

* Android Studio
* JDK 17

## Project note

The app is intentionally small and straightforward. Most of the quiz data lives in `app/src/main/kotlin/com/example/lifehackorrmyth/QuestionData.kt`, which makes it easy to change the statements or explanations without touching the rest of the app flow.

## GitHub Actions note

The GitHub Actions setup for this project can also be documented with the Android build action guide and the sample IMAD5112 workflow file you shared (amirisback, n.d.; IMAD5112, n.d.).

## References

American Red Cross. 2024. Should you eat right before swimming? [Online]. Available at: https://www.redcross.org/take-a-class/resources/articles/eating-before-swimming-myth [Accessed 24 April 2026].

Apple. 2025. If your iPhone or iPad gets too hot or too cold. [Online]. Available at: https://support.apple.com/en-us/118431 [Accessed 24 April 2026].

Centers for Disease Control and Prevention. 2025. Preventing seasonal flu. [Online]. Available at: https://www.cdc.gov/flu/prevention/ [Accessed 24 April 2026].

Cleveland Clinic. 2022. Why you should never put toothpaste on a pimple. [Online]. Available at: https://health.clevelandclinic.org/toothpaste-on-pimples [Accessed 24 April 2026].

IMAD5112. n.d. build.yml. [Online]. Available at: https://github.com/IMAD5112/Github-actions/blob/main/.github/workflows/build.yml [Accessed 24 April 2026].

amirisback. n.d. automated-build-android-app-with-github-action. [Online]. Available at: https://github.com/marketplace/actions/automated-build-android-app-with-github-action [Accessed 24 April 2026].
