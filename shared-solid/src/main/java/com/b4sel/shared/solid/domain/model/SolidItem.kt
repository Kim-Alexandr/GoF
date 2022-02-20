package com.b4sel.shared.solid.domain.model

enum class SolidItem(val principalName: String) {
    SRP("Принцип единственной ответственности"),
    OCP("Принцип открытости / закрытости"),
    LSP("Принцип подстановки Барбары Лисков"),
    ISP("Принцип разделения интерфейса"),
    DIP("Принцип инверсии зависимостей"),
}
