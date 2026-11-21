# Roadmap

Each phase is a GitHub milestone with a draft PR from a `phase/<n>-<name>` branch. Feature branches (`feat/p<n>-<slug>`) merge into `main`, and each one closes an issue.

## Phase 1 — Foundation
KMP project with Android, iOS and Web (Wasm) targets, Compose Multiplatform, Gradle version catalog, Koin, SQLDelight, Ktor client, Ktor server scaffold, Postgres via Docker, GitHub Actions CI, theme/design tokens, navigation, shared error/result types.

## Phase 2 — Auth & Profile
Backend auth (JWT + refresh), auth repository + use cases, login screen, signup screen, secure token storage per platform, session handling and auto-login, profile view/edit.

## Phase 3 — Groups & Members
Groups/members endpoints, groups list, create group, group detail, add/remove members, invite via link/code, leave/delete group.

## Phase 4 — Expenses & Splits
Expenses endpoints, split calculation engine (equal / exact / percentage / shares, with rounding), add expense screen, the split UI for each mode, edit/delete expense, categories, receipt attachment.

## Phase 5 — Balances & Settlements
Balance calculation, debt simplification algorithm, balances screen, settle-up flow, settlement endpoints, activity feed, friend/1:1 expenses.

## Phase 6 — Polish
Offline-first sync, multi-currency, CSV/PDF export, push notifications, search & filters, empty/error/loading states, accessibility, app icons and splash screens, release pipeline.

## Conventions
- Money is `Long` minor units plus an ISO-4217 currency code. Never use `Double`.
- Split math lives in `shared/commonMain/domain` and must be unit-tested.
- The server and clients share DTOs through a `shared` module source set where practical.
