📘 Basic Jetpack Compose Composables Explained
Jetpack Compose UIs are built with Composable functions — functions that describe the UI and react to data.

Here are some core ones:

🔹 Text()
Displays text on screen.
Text(text = "Hello World")
![Screenshot 2025-04-06 002648](https://github.com/user-attachments/assets/9a5834bd-cda3-4a15-8501-7312d326050c)


🔹 Button()
Creates a clickable button.
Button(onClick = { /* do something */ }) {
    Text("Click Me")
}
![Screenshot 2025-04-06 002727](https://github.com/user-attachments/assets/25d73296-fce4-4b43-b6bd-4a47011c6430)



🔹 Column() & Row()
For vertical and horizontal layout respectively.
Column {
    Text("Line 1")
    Text("Line 2")
}
![Screenshot 2025-04-06 002806](https://github.com/user-attachments/assets/102680db-b658-4632-a4a8-cbfb0f85fa2e)




🔹 Box()
Stacks items on top of each other (great for overlays, centered content, etc).
Box(contentAlignment = Alignment.Center) {
    Text("Centered")
}
![Screenshot 2025-04-06 002843](https://github.com/user-attachments/assets/e49863f8-430e-4a4e-a58a-6c49fe01dcce)



🔹 Image()
Displays an image from resources.
Image(
    painter = painterResource(id = R.drawable.sample),
    contentDescription = "Sample Image"
)
![Screenshot 2025-04-06 002921](https://github.com/user-attachments/assets/56d6a009-1531-4d7f-9348-6876de5eb899)



🚀 Benefits of Jetpack Compose
No more XML files — UI and logic live together.

Live Previews in Android Studio.

Built-in animations and theming.

Easy to manage state and UI together.

![Screenshot 2025-04-06 002045](https://github.com/user-attachments/assets/1a2009f3-c0f4-4bd0-9cb3-b6fb19d90c6c)
