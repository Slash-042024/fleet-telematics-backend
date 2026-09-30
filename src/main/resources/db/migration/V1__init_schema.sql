SQL

CREATE TABLE trucks (
    truck_id BIGINT PRIMARY KEY,
    model_name VARCHAR(100) NOT NULL,
    operational_status VARCHAR(50) NOT NULL,
    engine_temperature DOUBLE PRECISION NOT NULL,
),