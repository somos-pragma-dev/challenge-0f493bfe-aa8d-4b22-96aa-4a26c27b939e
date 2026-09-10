# Desarrollo de una API Reactiva con Spring WebFlux y R2DBC

Se requiere desarrollar una API que maneje operaciones de alta concurrencia y baja latencia utilizando Spring WebFlux y R2DBC. La API debe soportar la creación, lectura, actualización y eliminación de registros de una tabla de base de datos. Los registros representan transacciones financieras con campos como ID, fecha, monto, tipo y estado. La API debe ser idempotente para operaciones de creación y actualización, y debe manejar correctamente los errores de red y de base de datos. El sistema debe ser capaz de procesar al menos 10,000 transacciones por segundo con una latencia máxima de 50 milisegundos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Reactiva con Spring WebFlux y R2DBC |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del Entorno

**Objetivo:** Establecer un entorno de desarrollo con las dependencias necesarias para Spring WebFlux y R2DBC.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identificar y configurar las dependencias necesarias para Spring WebFlux y R2DBC.
- Configurar una base de datos compatible con R2DBC.
- Verificar que el entorno esté correctamente configurado y que las dependencias se puedan resolver.

**Entregable:** Entorno de desarrollo configurado y verificado.

<details>
<summary>Pistas de conocimiento</summary>

- Investigar sobre las mejores prácticas para configurar un proyecto con Spring WebFlux y R2DBC.
- Consultar la documentación oficial de Spring y R2DBC para resolver posibles problemas de configuración.

</details>

### Fase 2: Implementación de la API

**Objetivo:** Implementar las operaciones CRUD para la tabla de transacciones financieras.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Definir el modelo de datos para las transacciones financieras.
- Implementar los controladores para las operaciones de creación, lectura, actualización y eliminación.
- Asegurar que las operaciones de creación y actualización sean idempotentes.
- Manejar los errores de red y de base de datos de manera adecuada.

**Entregable:** API implementada con operaciones CRUD idempotentes y manejo de errores.

<details>
<summary>Pistas de conocimiento</summary>

- Investigar sobre el patrón de diseño idempotente y cómo aplicarlo en las operaciones de la API.
- Consultar ejemplos de manejo de errores en aplicaciones reactivas con Spring WebFlux.

</details>

### Fase 3: Optimización y Testing

**Objetivo:** Optimizar la API para cumplir con los requisitos de rendimiento y realizar pruebas unitarias y de integración.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Optimizar las consultas a la base de datos para mejorar el rendimiento.
- Implementar pruebas unitarias para los controladores y servicios.
- Realizar pruebas de integración para validar el funcionamiento de la API en conjunto.
- Verificar que la API cumpla con los requisitos de rendimiento establecidos.

**Entregable:** API optimizada y pruebas unitarias e de integración implementadas.

<details>
<summary>Pistas de conocimiento</summary>

- Investigar técnicas de optimización de consultas en bases de datos reactivas.
- Consultar ejemplos de pruebas unitarias e de integración en aplicaciones con Spring WebFlux.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una API reactiva y cómo se implementa con Spring WebFlux y R2DBC?
- **paraQueSirve**: ¿Para qué sirve implementar una API reactiva con Spring WebFlux y R2DBC en un sistema de transacciones financieras?
- **comoSeUsa**: ¿Cómo se aplica el patrón de diseño idempotente en las operaciones de una API reactiva?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar una API reactiva y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones de diseño implica la implementación de una API reactiva con Spring WebFlux y R2DBC?

## Criterios de Evaluacion

- Configuración correcta del entorno de desarrollo con Spring WebFlux y R2DBC.
- Implementación de operaciones CRUD idempotentes en la API.
- Manejo adecuado de errores de red y de base de datos.
- Optimización de la API para cumplir con los requisitos de rendimiento.
- Implementación de pruebas unitarias e de integración.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
