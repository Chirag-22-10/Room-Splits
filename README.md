# Room-Splits

A Splitwise-style expense-sharing app built with **Kotlin Multiplatform** and **Compose Multiplatform**. Share logic once, ship to Android, iOS, and Web.

## ✨ Features

- 👤 Auth & user profiles
- 👥 Groups & members (roommates, trips, friends)
- 💸 Expenses with flexible splits (equal, exact, %, shares)
- ⚖️ Balance calculation with debt simplification
- 🤝 Settle-up flow and activity feed
- 📴 Offline-first with sync
- 💱 Multi-currency
- 📤 CSV / PDF export

## 🧱 Tech Stack

| Layer | Tech |
|---|---|
| Shared logic | Kotlin Multiplatform |
| UI | Compose Multiplatform (Android / iOS / Web-Wasm) |
| DI | Koin |
| Networking | Ktor Client |
| Local DB | SQLDelight |
| Serialization | kotlinx.serialization |
| Async | Coroutines + Flow |
| Backend | Ktor Server + PostgreSQL |
| Architecture | Clean Architecture + MVI |
| CI | GitHub Actions |

## 🗂 Module Layout

```
Room-Splits/
├── composeApp/           # Compose UI shared across platforms
│   ├── commonMain/       # shared Compose code
│   ├── androidMain/
│   ├── iosMain/
│   └── wasmJsMain/
├── shared/               # KMP shared business + data
│   ├── commonMain/
│   │   ├── domain/       # entities + use cases
│   │   ├── data/         # repositories + data sources
│   │   ├── presentation/ # stores / view models
│   │   └── di/
│   ├── androidMain/
│   └── iosMain/
├── iosApp/               # Xcode wrapper
├── server/               # Ktor backend
└── .github/workflows/    # CI
```

## 🛣 Roadmap

Work is split into 6 phases, each a milestone on GitHub.

| Phase | Theme | Milestone |
|---|---|---|
| 1 | Foundation — KMP scaffold, CI, architecture | `phase-1-foundation` |
| 2 | Auth & profile | `phase-2-auth` |
| 3 | Groups & members | `phase-3-groups` |
| 4 | Expenses & splits | `phase-4-expenses` |
| 5 | Balances & settlements | `phase-5-balances` |
| 6 | Polish — offline sync, export, currency, notifications | `phase-6-polish` |

Backend work tracked under label `backend` across phases.

See [docs/ROADMAP.md](docs/ROADMAP.md) for the full breakdown.

## 🚀 Getting Started

> Scaffolding is tracked in [#1](../../issues/1). This section fills in once Phase 1 lands.

```bash
# Prereqs: JDK 17+, Android Studio (Koala+), Xcode 15+ (for iOS), Node 20+ (for Web)
./gradlew :composeApp:assembleDebug           # Android
./gradlew :composeApp:wasmJsBrowserDevelopmentRun  # Web
# iOS: open iosApp/iosApp.xcodeproj in Xcode
./gradlew :server:run                          # Backend
```

## 🤝 Contributing

Branching: `feat/<phase>-<slug>`, PR per issue. See [CONTRIBUTING.md](CONTRIBUTING.md).

## 📝 License

MIT
