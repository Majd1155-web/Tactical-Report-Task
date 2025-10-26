# Item Management Application

Full-stack web application for managing items with CRUD operations. Built with Spring Boot, Next.js, and MongoDB.

### Prerequisites

- Docker Desktop installed and running
- Git

### Run the Application

1. **Clone the repository**

```bash
   git clone <repository-url>
   cd <repository-name>
```

2. **Start all services**

```bash
   docker-compose up --build
```

3. **Access the application**

   - Frontend: http://localhost:3000
   - Backend API: http://localhost:8080

4. **Login credentials**

   - Username: `admin`
   - Password: `password`

5. **Stop the application**

```bash
   docker-compose down
```

That's it! Everything runs in Docker containers.

## Project Structure

```
├── backend/              # Spring Boot REST API
├── frontend/             # Next.js web application
└── docker-compose.yml    # Docker orchestration
```

## API Endpoints

| Method | Endpoint          | Description       |
| ------ | ----------------- | ----------------- |
| POST   | `/api/items`      | Create a new item |
| GET    | `/api/items`      | Get all items     |
| GET    | `/api/items/{id}` | Get item by ID    |
| PUT    | `/api/items/{id}` | Update an item    |
| DELETE | `/api/items/{id}` | Delete an item    |

### Example API Request

```bash
curl -X POST http://localhost:8080/api/items \
  -H "Content-Type: application/json" \
  -d '{"name":"Laptop","description":"Dell XPS 15"}'
```

## Testing

1. Open http://localhost:3000
2. Login with `admin` / `password`
3. Create, view, edit, and delete items through the UI
4. Or test the API directly using curl/Postman

## Features

- User authentication with session management
- Create, read, update, delete operations
- Input validation (frontend and backend)
- Responsive design (mobile, tablet, desktop)
- Error handling with user-friendly messages
- Dockerized for easy deployment

## Running Without Docker

If you prefer to run services individually:

### Backend

```bash
# Start MongoDB
docker run -d -p 27017:27017 mongo:latest

# Run backend
cd backend
./gradlew bootRun
```

### Frontend

```bash
cd frontend
npm install
npm run dev
```

## Troubleshooting

**View logs:**

```bash
docker-compose logs backend
docker-compose logs frontend
```

**Rebuild after changes:**

```bash
docker-compose up --build
```

**Clean restart:**

```bash
docker-compose down -v
docker-compose up --build
```

## Author

[Your Name]
