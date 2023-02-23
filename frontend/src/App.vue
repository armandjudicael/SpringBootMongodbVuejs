<template>
  <div>
    <h1>Product List</h1>
    <ul>
      <li v-for="product in products" :key="product.id">
        <img :src="product.imageUrl" :alt="product.name" />
        <div>
          <h2>{{ product.name }}</h2>
          <p>{{ product.description }}</p>
          <p>{{ product.price }}</p>
        </div>
      </li>
    </ul>
  </div>
</template>

<script lang="ts">
import { Product } from './Product';

@Component
export default class ProductList extends Vue {
  private products: Product[] = [
    {
      id: 1,
      name: 'Product 1',
      description: 'This is the first product',
      price: 10
    },
    {
      id: 2,
      name: 'Product 2',
      description: 'This is the second product',
      price: 20
    },
    {
      id: 3,
      name: 'Product 3',
      description: 'This is the third product',
      price: 30
    }
  ];
}
</script>