<p align="center" >
	<img src="/Images/logo_2048_600.png" alt="Wordy" title="Wordy">
</p>

<p align="center">
	<a href="https://http://www.android.com">
		<img src="https://img.shields.io/badge/android-15-green.svg?style=flat">
	</a>
	<a href="https://tldrlegal.com/license/apache-license-2.0-(apache-2.0)">
		<img src="https://img.shields.io/badge/License-Apache 2.0-blue.svg?style=flat">
	</a>
</p>

## At a Glance

`Wordy` is a powerful text processor that provides an easy way to manage content in `String` object.

## How to Get Started

Add `jitpack.io` repository to your project:

```javascript
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```

Then add `Wordy` to dependencies list:

```javascript
dependencies {
    implementation 'com.github.igormatyushkin014:Wordy-for-Android:1.4'
}
```

## Requirements

* Android SDK 15 and later
* Android Studio 3.0 and later
* Java 7 and later

## Usage

Everything starts with `Wordy` class. This is your entry point to all tools provided by the library.

### Text Effects

Let's start with a very simple example of text effect:

```java
String filteredText = Wordy.effects("Hi!")
    .apply(new InversionEffect())
    .getResult();

System.out.println(filteredText); // "!iH"
```

This is how it works: `Wordy.effects(...)` gives you an `EffectManager` instance configured for your source text. Then, you can apply some effects and retrieve the final text by `.getResult()` call.

In the example above, the `InversionEffect` will be applied to the entire string. The same time, you can apply effect to a particular substring:

```java
String filteredText = Wordy.effects("Hi!")
    .apply(new InversionEffect(), 0, 1) // Start index is 0, end index is 1
    .getResult();

System.out.println(filteredText); // "iH!"
```

You can add as many effects as you want:

```java
String filteredText = Wordy.effects("This text will be rotated")
    .apply(new RotationEffect(TextRotation.INVERTED))
    .apply(new InversionEffect())
    .getResult();

System.out.println(filteredText); // "рǝʇɐʇоɹ ǝq llıм ʇxǝʇ sıɥʇ"
```

#### Case Effect

Represented by `CaseEffect` class. Changes case for the entire text or letters at particular positions.

Constructor example:

```java
new CaseEffect(
    TextCase.FIRST_UPPER_NEXT_LOWER
)
```

[`TextCase`](#text-case) is the only setting that defines `CaseEffect`'s behavior.

#### Rotation Effect

Represented by `RotationEffect` class. Rotates letters. For example,

`p` becomes `d`

and

`h` becomes `ɥ`.

`RotationEffect` has two available constructors. The most detailed version of constructor:

```java
new RotationEffect(
    TextRotation.INVERTED,
    true
)
```

The first parameter is a [`TextRotation`](#text-rotation) value that defines the way to rotate symbols.

The second parameter of boolean type defines whether the rotation alrorithm should be case sensitive. If it equals to `false`, some uppercased symbols might become lowercased as a result of rotation.

The second constructor is a simplified version of the first one:

```java
new RotationEffect(
    TextRotation.INVERTED
)
```

It's case sensitive by default. Usually, it's enough to use the second constructor excepting cases when you need more flexibility.

#### Inversion Effect

Represented by `InversionEffect` class. Flips text from right to left, so

`Hi!`

turns into

`!iH`

`InversionEffect`'s constructor is very simple and doesn't require any parameters:

```java
new InversionEffect()
```

### Transliteration

Example of transliteration:

```java
String transliterated = Wordy.transliterate(
    Language.RUSSIAN,    // from Russian
    Language.ENGLISH     // to English
).getText("Привет!");

System.out.println(transliterated); // "Privet!", which means "Hi!"
```

Currently supported languages are:

- English
- Russian

### Options

#### Text Case

`TextCase` is used as a setting for `CaseEffect` instance. Available values are:

- `ALL_UPPER`: Makes the entire text uppercased.
- `ALL_LOWER`: Makes the entire text lowercased.
- `FIRST_UPPER_NEXT_LOWER`: First symbol is uppercased, other text is lowercased.
- `FIRST_LOWER_NEXT_UPPER`: First symbol is lowercased, other text is uppercased.
- `ALTERNATING_FIRST_UPPER_CASE`: Odd symbols are uppercased, even symbols are lowercased.
- `ALTERNATING_FIRST_LOWER_CASE`: Odd symbols are lowercased, even symbols are uppercased.

#### Text Rotation

`TextRotation` defines the conditions of symbol rotation. Available values:

- `NORMAL`: Forces all symbols to be rotated to normal position. It means that `ʎ` would become `y` and `h` would stay `h`.
- `UPSIDE_DOWN`: Forces all symbols to be rotated upside down. In this case, `y` would turn into `ʎ`, but `ɥ` wouldn't change at all.
- `INVERTED`: Normal symbols are forced to be rotated meanwhile rotated symbols become normal. So, `y` becomes `ʎ` and `ɥ` turns into `h`.

#### Language

The `Language` type is used for transliterations. Possible values:

- `ENGLISH`
- `RUSSIAN`

### Plugins

You can extend the functionality of `Wordy` without making changes to the library. Instead of sending pull request, simply create your own plugin.

Each plugin is a subclass of abstract class named `Plugin`. Take a look at the example below:

```java
public static class Repeat extends Plugin {

    public Repeat(
        String sourceText
    ) {
        super(sourceText);
    }

    @Override
    public String getResult() {
        return this.getSourceText()
            + this.getSourceText();
    }
}
```

This is a plugin that repeats the source text two times. All that you need to implement is:

- overrided constructor that takes `sourceText` parameter of `String` type;
- `getResult()` method that returns `String` with filtered text.

Now let's try to use the plugin:

```java
String repeatedText = Wordy.plugin(
    Repeat.class,
    "Test."
).getResult();

System.out.println(repeatedText); // "Test.Test."
```

As you can see, creating and using plugins for `Wordy` is quite easy. You can publish your plugins as separate library or send as a pull request if you want it to be included in the library after reviewal process.

## License

`Wordy` is available under the Apache 2.0 license. See the [LICENSE](./LICENSE) file for more info.
