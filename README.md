# Task Management API

Spring Boot を使用して作成したシンプルなタスク管理 REST API です。  
Docker を利用することで、Spring Boot と MySQL を簡単に起動できます。

---

# 概要

タスクの作成・取得・更新・削除（CRUD）を行う REST API です。

ポートフォリオとして以下の技術を学習・実装しました。

- Spring Boot
- REST API設計
- JPA（Hibernate）
- MySQL
- Swagger（APIドキュメント）
- Docker
- GitHub

---

# 使用技術

| 技術 | バージョン |
|-----|------|
| Java | 21 |
| Spring Boot | 3.x |
| Gradle | 9 |
| MySQL | 8 |
| Docker | 最新 |
| Swagger | springdoc-openapi |

---

# 機能一覧

- タスク作成
- タスク一覧取得
- タスク詳細取得
- タスク更新
- タスク削除

---

# API エンドポイント

| Method | Endpoint | 説明 |
|------|------|------|
| POST | /tasks | タスク作成 |
| GET | /tasks | タスク一覧取得 |
| GET | /tasks/{id} | タスク詳細取得 |
| PUT | /tasks/{id} | タスク更新 |
| DELETE | /tasks/{id} | タスク削除 |

---

# 環境構築（Docker）

## 1. リポジトリをクローン
git clone https://github.com/Yugo101/api-practice.git
cd api-practice

## 2. アプリケーションビルド

./gradlew build -x test

shell
コードをコピーする

## 3. Docker 起動

docker compose up --build

yaml
コードをコピーする

起動すると以下のコンテナが立ち上がります。

- Spring Boot
- MySQL

---

# API確認（Swagger）

ブラウザで以下にアクセスしてください。

http://localhost:8080/swagger-ui/index.html

yaml
コードをコピーする

Swagger UI から API をテストできます。

---

# ディレクトリ構成

api-practice
├── Dockerfile
├── docker-compose.yml
├── build.gradle
└── src/main
├── java/com/example/apipractice
│   ├── controller
│   ├── service
│   ├── repository
│   └── entity
└── resources
├── application.properties
└── application-docker.properties

yaml
コードをコピーする

---

# 今後の改善

今後以下の機能追加を予定しています。

- JWT認証
- ユーザー管理機能
- ページネーション
- バリデーション
- テストコード
- CI/CD（GitHub Actions）

---
