DROP TABLE IF EXISTS T_TT_PRODUCTS;

CREATE TABLE IF NOT EXISTS T_TT_PRODUCTS(
    ID UUID PRIMARY KEY,
    NM_PRODUCT VARCHAR(120) NOT NULL,
    DS_CATEGORY VARCHAR(150) NOT NULL,
    VL_PRICE NUMERIC(7,2) NOT NULL
);