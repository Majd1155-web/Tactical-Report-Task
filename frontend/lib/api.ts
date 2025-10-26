import { Item, ApiResponse } from '@/types/item';

const API_BASE_URL = process.env.NEXT_PUBLIC_API_BASE_URL;

export const itemsApi = {
  // Get all items
  async getAll(): Promise<Item[]> {
    const response = await fetch(`${API_BASE_URL}/api/items`);
    if (!response.ok) throw new Error('Failed to fetch items');
    const data: ApiResponse<Item[]> = await response.json();
    return data.returnField;
  },

  // Get single item by ID
  async getById(id: string): Promise<Item> {
    const response = await fetch(`${API_BASE_URL}/api/items/${id}`);
    if (!response.ok) throw new Error('Failed to fetch item');
    const data: ApiResponse<Item> = await response.json();
    return data.returnField;
  },

  // Create new item
  async create(item: Omit<Item, 'id'>): Promise<Item> {
    const response = await fetch(`${API_BASE_URL}/api/items`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(item),
    });
    if (!response.ok) {
      const errorData = await response.json();
      throw new Error(errorData.message || 'Failed to create item');
    }
    const data: ApiResponse<Item> = await response.json();
    return data.returnField;
  },

  // Update item
  async update(id: string, item: Omit<Item, 'id'>): Promise<Item> {
    const response = await fetch(`${API_BASE_URL}/api/items/${id}`, {
      method: 'PUT',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(item),
    });
    if (!response.ok) {
      const errorData = await response.json();
      throw new Error(errorData.message || 'Failed to update item');
    }
    const data: ApiResponse<Item> = await response.json();
    return data.returnField;
  },

  // Delete item
  async delete(id: string): Promise<void> {
    const response = await fetch(`${API_BASE_URL}/api/items/${id}`, {
      method: 'DELETE',
    });
    if (!response.ok) throw new Error('Failed to delete item');
  },
};