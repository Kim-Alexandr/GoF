# GoF
## Диаграмма заивисимостей. 
[![](https://github.com/b4sel/GoF/blob/master/Untitled%20Diagram.jpg?raw=true)](https://github.com/b4sel/GoF/blob/master/Untitled%20Diagram.jpg?raw=true)

- feature это модули с которыми может взаимодействовать пользователь
- shared модули содержат какие-то утилиты или код который может использоваться в нескольких местах
- app модуль соединяет в себе все остальные feature модули 

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

## :feature-selection
Модуль с одним экраном и навигацией к списку SOLID принципов и на экран с паттернами

## :feature-solid 
Модуль со списком принципов SOLID. Есть навигация к каждому принципу (фиче)

## :feature-principal
Модуль с bottom navigation. Содержит в себе еще три feature модуля feature-structural, feature-behavioral, feature-creational. 

## Возможность подменить навигацию
Для того чтобы все работало корректно необходимо раскоментить binds методы в SolidNavigationModule и в SelectionNavigationModule
