package com.b4sel.shared.solid

import com.b4sel.shared.solid.domain.model.SolidItem.SRP
import com.b4sel.shared.solid.domain.model.SolidItem.OCP
import com.b4sel.shared.solid.domain.model.SolidItem.LSP
import com.b4sel.shared.solid.domain.model.SolidItem.ISP
import com.b4sel.shared.solid.domain.model.SolidItem.DIP
import com.b4sel.shared.solid.domain.model.SolidPrincipal

object SolidCatalog {
    val solidList = listOf(SRP, OCP, LSP, ISP, DIP)

    val srp = SolidPrincipal(
        name = "Принцип единственной ответственности",
        description = "Принцип декларирует, что каждый объект должен иметь одну обязанность и эта" +
                " обязанность должна быть полностью инкапсулирована в класс, а все его сервисы " +
                "должны быть направлены исключительно на обеспечение этой обязанности.\n" +
                "\n" +
                "Следование принципу заключается обычно в декомпозиции сложных классов, " +
                "которые делают сразу много вещей, на простые, отвественность которых очень " +
                "специализирована. Но также и объединении в отдельный класс однотипной " +
                "функциональности, которая может оказаться распределённой по многим классам, " +
                "может рассматриваться как следование этому принципу."
    )
    val ocp = SolidPrincipal(
        name = "Принцип открытости / закрытости",
        description = "Принцип декларирует, что программные сущности (классы, модули, функции " +
                "и т. п.) должны быть открыты для расширения, но закрыты для изменения. " +
                "Это означает, что эти сущности могут менять свое поведение без изменения их " +
                "исходного кода.\n" +
                "\n" +
                "В этом контексте открытость для расширения — это возможность добавить для класса, " +
                "модуля или функции новое поведение, если необходимость в этом возникнет, " +
                "а закрытость для изменений — это запрет на изменение исходного кода  программных " +
                "сущностей. На первый взгляд, это звучит сложно и противоречиво. Но если " +
                "разобраться, то принцип вполне логичен."
    )
    val lsp = SolidPrincipal(
        name = "Принцип подстановки Барбары Лисков",
        description = "Принцип в формулировке Роберта Мартина декларирует, что функции, которые " +
                "используют базовый тип, должны иметь возможность использовать подтипы базового " +
                "типа не зная об этом. Оригинальное определение Барбары Лисков более формальное " +
                "и заметно сложнее для восприятия: «В том случае, если q(x) — свойство, верное " +
                "по отношению к объектам х некого типа T, то свойство q(y) тоже будет верным " +
                "относительно ряда объектов y, которые относятся к типу S, при этом S — подтип " +
                "некого типа T».\n" +
                "\n" +
                "Следование принципу LSP заключается в том, что при построении иерархий " +
                "наследования создаваемые наследники должны корректно реализовывать поведение " +
                "базового типа. То есть если базовый тип реализует определённое поведение, то " +
                "это поведение должно быть корректно реализовано и для всех его наследников."
    )
    val isp = SolidPrincipal(
        name = "Принцип разделения интерфейса",
        description = "Принцип в формулировке Роберта Мартина декларирует, что клиенты не должны " +
                "зависеть от методов, которые они не используют. То есть если какой-то метод " +
                "интерфейса не используется клиентом, то изменения этого метода не должны " +
                "приводить к необходимости внесения изменений в клиентский код.\n" +
                "\n" +
                "Следование принципу ISP заключается в создании интерфейсов, которые достаточно " +
                "специфичны и требуют только необходимый минимум реализаций методов. Избыточные " +
                "интерфейсы, напротив, могут требовать от реализующего класса создание большого " +
                "количества методов, причём даже таких, которые не имеют смысла в контексте класса."
    )
    val dip = SolidPrincipal(
        name = "Принцип инверсии зависимостей",
        description = "Принцип декларирует, что модули верхних уровней не должны зависеть от " +
                "модулей нижних уровней, а оба типа модулей должны зависеть от абстракций, сами " +
                "абстракции не должны зависеть от деталей, а вот детали должны зависеть от " +
                "абстракций.\n" +
                "\n" +
                "Следование принципу инверсии зависимостей «заставляет» реализовывать " +
                "высокоуровневые компоненты без встраивания зависимостей от конкретных " +
                "низкоуровневых классов, что, например, сильно упрощает замену используемых " +
                "зависимостей как по изнес-требованиям, так и для целей тестирования. При этом " +
                "зависимость формируется не от конкретной реализации, а от абстракции — " +
                "реализуемого зависимостью интерфейса."
    )
}