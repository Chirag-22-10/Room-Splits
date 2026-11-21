# Contributing

## Workflow
1. Pick an issue from the current phase milestone.
2. Branch from `main`: `feat/p<phase>-<short-slug>` (e.g. `feat/p2-login-screen`). Use `fix/` for bugs.
3. Keep PRs scoped to one issue. Reference it with `Closes #<n>`.
4. CI must pass (build + tests) before merge.
5. Squash-merge into `main`.

## Commit style
Conventional commits: `feat:`, `fix:`, `chore:`, `refactor:`, `test:`, `docs:`.

## Code style
- Business logic lives in `shared/commonMain` — no platform APIs there.
- Platform code goes in `androidMain` / `iosMain` / `wasmJsMain` via `expect`/`actual`.
- Money is stored as `Long` minor units (cents), never `Double`.
- Every use case gets a unit test in `commonTest`.
