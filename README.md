# GoF
## Диаграмма заивисимостей. 
[![](https://github.com/b4sel/GoF/blob/master/Untitled%20Diagram.jpg?raw=true)](https://github.com/b4sel/GoF/blob/master/Untitled%20Diagram.jpg?raw=true)

- feature это модули, которые несут какую-нибудь практическую пользу пользователю (с которыми может взаимодействовать пользователь например)
- shared модули содержат какие-то утилиты или код который может использоваться в нескольких местах
- app модуль соединяет в себе все остальные feature модули, а также предоставляет им зависимости

## Стек
- Dagger 2
- MVVM & Clean arch
- Jetpack navigation
- Multi module arch

# Навигация
Каждый :feature модуль создает для себя интерфейс, в котором перечисляет возможные варианты навигации. Реализация этого интерфейса будет 
лежать в модуле :app, сама фича будет использовать реализацию, которую ей прокинет dagger. 

## :shared-core
Модуль содержит scopes для dagger'a и ViewModelFactory

## :shared-navigation
Модуль для навигации. Содержит `NavigationCommand` - data class с id [action'a](https://developer.android.com/guide/navigation/navigation-getting-started#connect). 
Каждый feature модуль будет создавать для себя интерфейс с полями `NavigationCommand`, на какую фичу нужно перейти. Реализация этого интерфейса будет лежать в модуле app. 

## :shared-solid
Модуль с мок данными

## :feature-solid 
Модуль со списком принципов SOLID. Есть навигация к каждому принципу (фиче)

## Возможность подменить навигацию
Для того чтобы все работало корректно необходимо раскоментить/закоментить реализации в в классах RouterImpl
